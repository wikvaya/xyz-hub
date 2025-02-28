/*
 * Copyright (C) 2017-2019 HERE Europe B.V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 * License-Filename: LICENSE
 */

package com.here.xyz.events;

import java.util.List;

public abstract class QueryEvent<T extends QueryEvent> extends ContextAwareEvent<T> {

  private TagsQuery tags;
  private PropertiesQuery propertiesQuery;
  private List<String> selection;

  public TagsQuery getTags() {
    return this.tags;
  }

  public void setTags(TagsQuery tags) {
    this.tags = tags;
  }

  @SuppressWarnings("unused")
  public T withTags(TagsQuery tags) {
    setTags(tags);
    return (T)this;
  }

  @SuppressWarnings("unused")
  public PropertiesQuery getPropertiesQuery() {
    return this.propertiesQuery;
  }

  @SuppressWarnings("WeakerAccess")
  public void setPropertiesQuery(PropertiesQuery propertiesQuery) {
    this.propertiesQuery = propertiesQuery;
  }

  @SuppressWarnings("unused")
  public T withPropertiesQuery(PropertiesQuery propertiesQuery) {
    setPropertiesQuery(propertiesQuery);
    return (T)this;
  }

  @SuppressWarnings("unused")
  public List<String> getSelection() {
    return this.selection;
  }

  @SuppressWarnings("WeakerAccess")
  public void setSelection(List<String> selection) {
    this.selection = selection;
  }

  @SuppressWarnings("unused")
  public T withSelection(List<String> selection) {
    setSelection(selection);
    return (T)this;
  }
}
