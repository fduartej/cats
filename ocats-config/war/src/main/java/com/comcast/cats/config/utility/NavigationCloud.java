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
package com.comcast.cats.config.utility;

import javax.inject.Named;

import org.primefaces.model.tagcloud.DefaultTagCloudItem;
import org.primefaces.model.tagcloud.DefaultTagCloudModel;
import org.primefaces.model.tagcloud.TagCloudModel;

@Named
public class NavigationCloud
{

    private TagCloudModel model;  
    
    public NavigationCloud() {  
        model = new DefaultTagCloudModel();  
        model.addTag(new DefaultTagCloudItem("Rack Detail","/rack/List.xhtml" ,1));  
        model.addTag(new DefaultTagCloudItem("Home", "/index.html", 3));  
        model.addTag(new DefaultTagCloudItem("Settops", "/settop/List.xhtml",2));  
        model.addTag(new DefaultTagCloudItem("Recording", "/recording/List.xhtml",2));  
    }  
  
    public TagCloudModel getModel() {  
        return model;  
    }
}
