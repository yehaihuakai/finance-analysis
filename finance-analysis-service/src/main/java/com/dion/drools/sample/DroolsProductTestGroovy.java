package com.dion.drools.sample;

import com.dion.drools.Product;
import com.dion.utils.groovyUtil.GroovyUtils;
import org.kie.api.KieServices;
import org.kie.api.builder.KieRepository;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * Created by liyang on 2017/8/16.
 */
public class DroolsProductTestGroovy {

    public static final void main(String[] args) {
        try {
//            // 构建KieServices
//            KieServices ks = KieServices.Factory.get();
//            KieContainer kContainer = ks.getKieClasspathContainer();
//            // 获取kmodule.xml中配置中名称为ksession-rule的session，默认为有状态的。
//            KieSession kSession = kContainer.newKieSession("ksession-rules-message");
//
//            // 获取KieRepository
//            KieRepository kieRepository = ks.getRepository();


            // go !
            Product product = new Product();
            product.setType(Product.DIAMOND);
            System.out.println("-----调用规则引擎之前-----" + product.toString() + "---------------------print by java");
            GroovyUtils.invokeGroovy("GrTestProduct.groovy","testGrDr",product);

//            kSession.insert(product);
//            int count = kSession.fireAllRules();
//            kSession.dispose();

//            System.out.println("命中了" + count + "条规则！");
            System.out.println("-----调用规则引擎之后-----" + product.toString() + "---------------------print by java");
            System.out.println("The discount for the product " + product.getType()
                    + " is " + product.getDiscount()+"%" + "---------------------print by java");
            System.out.println("商品" + product.getType() + "的商品折扣为" + product.getDiscount() + "%。" + "---------------------print by java");

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

}
