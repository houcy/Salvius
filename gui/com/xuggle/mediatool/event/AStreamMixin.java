/*******************************************************************************
 * Copyright (c) 2008, 2010 Xuggle Inc.  All rights reserved.
 *  
 * This file is part of Xuggle-Xuggler-Main.
 *
 * Xuggle-Xuggler-Main is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Xuggle-Xuggler-Main is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Xuggle-Xuggler-Main.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/

package com.xuggle.mediatool.event;

import com.xuggle.mediatool.IMediaGenerator;

/**
 * An abstract implementation of {@link IStreamEvent}, but does not declare
 * {@link IStreamEvent}.
 * @author aclarke
 *
 */
public abstract class AStreamMixin extends AEventMixin
{
  private final Integer mStreamIndex;

  /**
   * Create an {@link AStreamMixin}.
   * @param source the source.
   * @param streamIndex the stream index, or null if unknown.
   */
  public AStreamMixin(IMediaGenerator source, Integer streamIndex)
  {
    super(source);
    mStreamIndex = streamIndex;
  }

  /**
   * Implementation of {@link IStreamEvent#getStreamIndex()}.
   * @see com.xuggle.mediatool.event.IStreamEvent#getStreamIndex()
   */
  public Integer getStreamIndex()
  {
    return mStreamIndex;
  }
}