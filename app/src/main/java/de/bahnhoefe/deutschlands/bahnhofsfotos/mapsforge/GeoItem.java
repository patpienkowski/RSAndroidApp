/*
 * Copyright 2009 Huan Erdao
 * Copyright 2014 Martin Vennekamp
 * Copyright 2015 mapsforge.org
 *
 * This program is free software: you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */

package de.bahnhoefe.deutschlands.bahnhofsfotos.mapsforge;

import org.mapsforge.core.model.LatLong;

/**
 * Utility Class to handle GeoItem for ClusterMarker
 */
public interface GeoItem {
    /**
     * getLatLong
     *
     * @return item location in LatLong.
     */
    LatLong getLatLong();

    /**
     * getTitle
     *
     * @return Title of the item, might be used as Caption text.
     */
    String getTitle();

    boolean hasPhoto();

    boolean ownPhoto();

}