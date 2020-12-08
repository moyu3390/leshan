/*******************************************************************************
 * Copyright (c) 2013-2015 Sierra Wireless and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 * 
 * The Eclipse Public License is available at
 *    http://www.eclipse.org/legal/epl-v20.html
 * and the Eclipse Distribution License is available at
 *    http://www.eclipse.org/org/documents/edl-v10.html.
 * 
 * Contributors:
 *     Sierra Wireless - initial API and implementation
 *******************************************************************************/
package org.eclipse.leshan.server;

/**
 * @deprecated please consider to use {@link org.eclipse.leshan.core.Destroyable} instead. This interface is going to be removed at version 2.0.
 */
@Deprecated
public interface Destroyable extends org.eclipse.leshan.core.Destroyable {

    /** Destroy the instances and frees all system resources. */
    @Override
    void destroy();

}
