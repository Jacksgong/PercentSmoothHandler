/*
 * Copyright (c) 2016 Jacksgong(blog.dreamtobe.cn).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.dreamtobe.percentsmoothhandler;

/**
 * Created by Jacksgong on 2/2/16.
 * <p/>
 * handle the case of the internal of the percent between the current and the last is
 * too large to smooth for the target
 *
 * @see SmoothHandler
 */
public interface ISmoothTarget {

    float getPercent();

    void setPercent(float percent);

    /**
     * recommend call {@link SmoothHandler#loopSmooth(float)}
     *
     * @param percent the aim percent
     */
    void setSmoothPercent(float percent);
}
