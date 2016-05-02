# PercentSmoothHandler

Let the progress smoothly.

[ ![Download][bintray_svg] ][bintray_link]

## Demo

![][demo_gif]

## Installation

PercentSmoothHandler is installed by adding the following dependency to your `build.gradle` file:

```
dependencies {
    compile 'cn.dreamtobe.percentsmoothhandler:library:0.1.1'
}
```

## How to integrate?

> As easy as following commit

#### Step 1:

[test: add SmoothHandler integration to ProgressBar](https://github.com/Jacksgong/PercentSmoothHandler/commit/d253a86b4cb8dd56332bf4d00cc350fa01fe08f0)

#### Step 2:

> Invoke the `SmoothHandler#commitPercent` in the method where you will change your percent.

[test: adapter the 'commitPercent' in SmoothProgressBar](https://github.com/Jacksgong/PercentSmoothHandler/commit/7092746888610b819658e27c5c616ee85aebb9f5)

#### Step 3:

[demo(smooth_with_duration): adapt the smoothly processing with a definite duration millisecond](https://github.com/Jacksgong/PercentSmoothHandler/commit/6682a8ee0c1eb1d3a423b6f89dbec8ce0f630b06)

## LICENSE

```
Copyright (c) 2016 Jacksgong(blog.dreamtobe.cn).

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

[bintray_svg]: https://api.bintray.com/packages/jacksgong/maven/PercentSmoothHandler/images/download.svg
[bintray_link]: https://bintray.com/jacksgong/maven/PercentSmoothHandler/_latestVersion
[demo_gif]: https://github.com/Jacksgong/PercentSmoothHandler/raw/master/art/demo.gif
