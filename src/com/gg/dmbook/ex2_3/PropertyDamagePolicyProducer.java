package com.gg.dmbook.ex2_3;






public class PropertyDamagePolicyProducer implements PolicyProducer
{
    public AutoInsurance getPolicyObj() //Fruit factory()
    {
        return new PropertyDamageLiability();
    }
}
