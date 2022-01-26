/*
 * Copyright © 2011 jbundle.org. All rights reserved.
 */
package web;

/**
 * Start up the web service listener.
 * @author don
 */
public class HttpServiceActivator extends group.osgi.HttpServiceActivator
{
    public String getServletClass()
    {
        return org.apache.catalina.servlets.CGIServlet.class.getName();    // Override this to enable config admin.
    }
}
