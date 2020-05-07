package com.jeremiahseagraves.designpatterns.creational.factory;

import java.util.Optional;

public class WebsiteFactory {

    public static Optional<Website> getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG: {
                return Optional.of(new Blog());
            }

            case SHOP: {
                return Optional.of(new Shop());
            }

            default: {
                return Optional.empty();
            }
        }
    }

}
