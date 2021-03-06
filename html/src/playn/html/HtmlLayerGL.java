/**
 * Copyright 2010 The PlayN Authors
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package playn.html;

import playn.core.InternalTransform;
import playn.core.gl.LayerGL;

abstract class HtmlLayerGL extends LayerGL {

  protected final HtmlGraphicsGL gfx;

  protected HtmlLayerGL(HtmlGraphicsGL gfx) {
    super();
    this.gfx = gfx;
  }

  @Override protected InternalTransform createTransform() {
    return new HtmlInternalTransform();
  }
}
