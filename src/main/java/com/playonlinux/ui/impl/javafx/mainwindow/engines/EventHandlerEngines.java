/*
 * Copyright (C) 2015 PÂRIS Quentin
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.playonlinux.ui.impl.javafx.mainwindow.engines;

import com.playonlinux.dto.ui.engines.WineVersionDistributionItemDTO;
import com.playonlinux.dto.ui.engines.WineVersionsWindowDTO;
import com.playonlinux.ui.events.EventHandler;
import com.playonlinux.core.injection.Inject;
import com.playonlinux.core.injection.Scan;
import com.playonlinux.ui.api.EntitiesProvider;
import com.playonlinux.ui.api.UIEventHandler;
import org.apache.log4j.Logger;

@Scan
class EventHandlerEngines implements UIEventHandler {
    @Inject
    static EventHandler mainEventHandler;

    @Override
    public EventHandler getMainEventHandler() {
        return mainEventHandler;
    }


    public EntitiesProvider<WineVersionDistributionItemDTO, WineVersionsWindowDTO> getRemoteWineVersions() {
        return mainEventHandler.getRemoteWineVersions();
    }
}
