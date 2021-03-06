/*
 * Copyright (c) 2016 Piruin Panichphol
 *   National Electronics and Computer Technology Center, Thailand
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.piruin.phototaker.intent;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.File;

public class CaptureIntent extends Intent {

  public CaptureIntent(File outputFile) {
    super(MediaStore.ACTION_IMAGE_CAPTURE);
    putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
    putExtra("return-data", true);
    putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(outputFile));
  }
}
