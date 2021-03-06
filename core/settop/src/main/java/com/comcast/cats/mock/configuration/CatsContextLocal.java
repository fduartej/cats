/**
 * Copyright 2014 Comcast Cable Communications Management, LLC
 *
 * This file is part of CATS.
 *
 * CATS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * CATS is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with CATS.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.comcast.cats.mock.configuration;

import com.comcast.cats.CatsEnvironment;
import com.comcast.cats.EnvironmentFactory;
import com.comcast.cats.SettopFactoryImpl;
import com.comcast.cats.configuration.ApplicationContextProvider;
import com.comcast.cats.configuration.CatsContext;
import com.comcast.cats.mock.service.DeviceSearchServiceLocal;

/**
 * Extend the Cats dummy context.
 * 
 * @author cfrede001
 * 
 */
public class CatsContextLocal extends CatsContext
{

	/**
     * constructor
     */
    public CatsContextLocal()
    {
        super();
        addCatsPackagesToContext();
    }

    /**
     * Override this function to add additional packages to be scanned during
     * spring context creation.
     */
    @Override
    protected void addCatsPackagesToContext()
    {
        this.scan( "com.comcast.cats.configuration" );
        this.scan( "com.comcast.cats.domain.configuration" );
        this.scan( "com.comcast.cats.event.impl" );
        this.scan( "com.comcast.cats.provider" );
        this.scan( "com.comcast.cats.provider.impl" );
        this.scan( "com.comcast.cats.decorator" );
        this.scan( "com.comcast.cats.vision.panel.configuration" );

        this.register( SettopFactoryImpl.class );
        this.register( EnvironmentFactory.class );
        this.register( CatsEnvironment.class );
        this.register( ApplicationContextProvider.class );

        // Now lets scan the dummy service classes for testing
        this.scan( "com.comcast.cats.mock.configuration" );
        this.scan( "com.comcast.cats.mock.service" );
        this.register( DeviceSearchServiceLocal.class );
    }
}
