package groovy

import com.dion.drools.Product
import org.kie.api.KieServices
import org.kie.api.builder.KieRepository
import org.kie.api.runtime.KieContainer
import org.kie.api.runtime.KieSession


//多次申请设备json列表返回Map对象
def testGrDr(product) {
    // 构建KieServices
    KieServices ks = KieServices.Factory.get();
    KieContainer kContainer = ks.getKieClasspathContainer();
    // 获取kmodule.xml中配置中名称为ksession-rule的session，默认为有状态的。
    KieSession kSession = kContainer.newKieSession("ksession-rules-message");

    // 获取KieRepository
    KieRepository kieRepository = ks.getRepository();


    // go !
    product.setType(Product.DIAMOND);
    kSession.insert(product);
    int count = kSession.fireAllRules();
    println("共命中规则 " + count + " 条-----" + product.toString() + "---------------------print by groovy")

    kSession.dispose();
}