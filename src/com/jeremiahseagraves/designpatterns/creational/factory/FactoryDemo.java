package com.jeremiahseagraves.designpatterns.creational.factory;

public class FactoryDemo {

    public static void main(String[] args) {
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG).get();

        System.out.println(site.getPages());

        site = WebsiteFactory.getWebsite(WebsiteType.SHOP).get();

        System.out.println(site.getPages());
    }

}
