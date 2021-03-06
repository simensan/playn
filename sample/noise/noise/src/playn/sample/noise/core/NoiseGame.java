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
package playn.sample.noise.core;

import playn.core.PlayN;
import playn.core.Game;
import playn.core.Sound;

public class NoiseGame implements Game {

  private Sound[] sounds = new Sound[45];
  private int count;

  @Override
  public void init() {
    for (int i = 0; i < sounds.length; i++) {
      PlayN.log().info("Create sound " + i + "...");
      // sounds[i] = PlayN.assetManager().getSound("Bird_Yellow_Flying_1");
      sounds[i] = PlayN.assetManager().getSound("Bird_Black_Selected_1");
      // sounds[i] = PlayN.assetManager().getSound("Bird_Red_Selected_1");
    }

    // background
//    Sound bgSound = PlayN.assetManager().getSound("ambient_green_jungleish");
    Sound bgSound = PlayN.assetManager().getSound("ambient_red_savannah");
//    Sound bgSound = PlayN.assetManager().getSound("ambient_white_dryforest");
//    Sound bgSound = PlayN.assetManager().getSound("ambient_city");
    bgSound.setLooping(true);
    bgSound.play();
  }

  @Override
  public void update(float delta) {
    count++;

    // PlayN.log().info("update(" + count + ")");
    if (count < 3) {
      playSound(count % sounds.length);
    } else {
      try {
        int i = 0;
        playSound(i);
      } catch (Throwable e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    // sound.stop();
  }

  private void playSound(int idx) {
    PlayN.log().info("play " + idx + "...");
    sounds[idx].play();
  }

  @Override
  public void paint(float alpha) {
  }

  @Override
  public int updateRate() {
    return 500;
  }

}
