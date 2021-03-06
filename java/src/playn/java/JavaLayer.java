/**
 * Copyright 2011 The PlayN Authors
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package playn.java;

import playn.core.AbstractLayer;
import playn.core.Canvas;

abstract class JavaLayer extends AbstractLayer {

  public JavaLayer() {
    super();
  }

  abstract void paint(JavaCanvas canvas);

  void transform(Canvas canvas) {
    canvas.translate(originX, originY);
    canvas.transform(transform.m00(), transform.m01(), transform.m10(),
        transform.m11(), transform.tx() - originX, transform.ty() - originY);
    canvas.translate(-originX, -originY);
  }
}
