package com.gg.dmbook.ex2_3;







public class BodyInjurPolicyProducer implements PolicyProducer
{
    public AutoInsurance getPolicyObj() //Fruit factory()
    {
        return new BodyInjurLiability();
    }
}
