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
package com.comcast.cats.recorder.domain.service;

import com.comcast.cats.recorder.domain.MediaMetaData;
import com.comcast.cats.recorder.exception.RecorderNotFoundException;

/**
 * Entity service for {@link MediaMetaData}.
 * 
 * @author SSugun00c
 * 
 */
public interface MediaMetaDataEntityService
{
    int deleteByRecordingId( Integer recordingId );

    int deleteById( Integer mediaMetaDataId ) throws RecorderNotFoundException;
}
