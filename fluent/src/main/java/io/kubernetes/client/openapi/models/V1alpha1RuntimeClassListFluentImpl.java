/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.BaseFluent;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/** Generated */
@SuppressWarnings(value = "unchecked")
public class V1alpha1RuntimeClassListFluentImpl<A extends V1alpha1RuntimeClassListFluent<A>>
    extends BaseFluent<A> implements V1alpha1RuntimeClassListFluent<A> {
  public V1alpha1RuntimeClassListFluentImpl() {}

  public V1alpha1RuntimeClassListFluentImpl(
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClassList instance) {
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());
  }

  private String apiVersion;
  private ArrayList<V1alpha1RuntimeClassBuilder> items;
  private java.lang.String kind;
  private V1ListMetaBuilder metadata;

  public java.lang.String getApiVersion() {
    return this.apiVersion;
  }

  public A withApiVersion(java.lang.String apiVersion) {
    this.apiVersion = apiVersion;
    return (A) this;
  }

  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }

  public A addToItems(
      Integer index, io.kubernetes.client.openapi.models.V1alpha1RuntimeClass item) {
    if (this.items == null) {
      this.items =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder>();
    }
    io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder builder =
        new io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder(item);
    _visitables.get("items").add(index >= 0 ? index : _visitables.get("items").size(), builder);
    this.items.add(index >= 0 ? index : items.size(), builder);
    return (A) this;
  }

  public A setToItems(
      java.lang.Integer index, io.kubernetes.client.openapi.models.V1alpha1RuntimeClass item) {
    if (this.items == null) {
      this.items =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder>();
    }
    io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder builder =
        new io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder(item);
    if (index < 0 || index >= _visitables.get("items").size()) {
      _visitables.get("items").add(builder);
    } else {
      _visitables.get("items").set(index, builder);
    }
    if (index < 0 || index >= items.size()) {
      items.add(builder);
    } else {
      items.set(index, builder);
    }
    return (A) this;
  }

  public A addToItems(io.kubernetes.client.openapi.models.V1alpha1RuntimeClass... items) {
    if (this.items == null) {
      this.items =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1alpha1RuntimeClass item : items) {
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder builder =
          new io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder(item);
      _visitables.get("items").add(builder);
      this.items.add(builder);
    }
    return (A) this;
  }

  public A addAllToItems(
      Collection<io.kubernetes.client.openapi.models.V1alpha1RuntimeClass> items) {
    if (this.items == null) {
      this.items =
          new java.util.ArrayList<
              io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder>();
    }
    for (io.kubernetes.client.openapi.models.V1alpha1RuntimeClass item : items) {
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder builder =
          new io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder(item);
      _visitables.get("items").add(builder);
      this.items.add(builder);
    }
    return (A) this;
  }

  public A removeFromItems(io.kubernetes.client.openapi.models.V1alpha1RuntimeClass... items) {
    for (io.kubernetes.client.openapi.models.V1alpha1RuntimeClass item : items) {
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder builder =
          new io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder(item);
      _visitables.get("items").remove(builder);
      if (this.items != null) {
        this.items.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeAllFromItems(
      java.util.Collection<io.kubernetes.client.openapi.models.V1alpha1RuntimeClass> items) {
    for (io.kubernetes.client.openapi.models.V1alpha1RuntimeClass item : items) {
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder builder =
          new io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder(item);
      _visitables.get("items").remove(builder);
      if (this.items != null) {
        this.items.remove(builder);
      }
    }
    return (A) this;
  }

  public A removeMatchingFromItems(
      Predicate<io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder> predicate) {
    if (items == null) return (A) this;
    final Iterator<io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder> each =
        items.iterator();
    final List visitables = _visitables.get("items");
    while (each.hasNext()) {
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder builder = each.next();
      if (predicate.test(builder)) {
        visitables.remove(builder);
        each.remove();
      }
    }
    return (A) this;
  }

  /**
   * This method has been deprecated, please use method buildItems instead.
   *
   * @return The buildable object.
   */
  @Deprecated
  public List<io.kubernetes.client.openapi.models.V1alpha1RuntimeClass> getItems() {
    return items != null ? build(items) : null;
  }

  public java.util.List<io.kubernetes.client.openapi.models.V1alpha1RuntimeClass> buildItems() {
    return items != null ? build(items) : null;
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClass buildItem(
      java.lang.Integer index) {
    return this.items.get(index).build();
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClass buildFirstItem() {
    return this.items.get(0).build();
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClass buildLastItem() {
    return this.items.get(items.size() - 1).build();
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClass buildMatchingItem(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder item : items) {
      if (predicate.test(item)) {
        return item.build();
      }
    }
    return null;
  }

  public java.lang.Boolean hasMatchingItem(
      java.util.function.Predicate<io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder>
          predicate) {
    for (io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder item : items) {
      if (predicate.test(item)) {
        return true;
      }
    }
    return false;
  }

  public A withItems(
      java.util.List<io.kubernetes.client.openapi.models.V1alpha1RuntimeClass> items) {
    if (this.items != null) {
      _visitables.get("items").removeAll(this.items);
    }
    if (items != null) {
      this.items = new java.util.ArrayList();
      for (io.kubernetes.client.openapi.models.V1alpha1RuntimeClass item : items) {
        this.addToItems(item);
      }
    } else {
      this.items = null;
    }
    return (A) this;
  }

  public A withItems(io.kubernetes.client.openapi.models.V1alpha1RuntimeClass... items) {
    if (this.items != null) {
      this.items.clear();
    }
    if (items != null) {
      for (io.kubernetes.client.openapi.models.V1alpha1RuntimeClass item : items) {
        this.addToItems(item);
      }
    }
    return (A) this;
  }

  public java.lang.Boolean hasItems() {
    return items != null && !items.isEmpty();
  }

  public V1alpha1RuntimeClassListFluent.ItemsNested<A> addNewItem() {
    return new V1alpha1RuntimeClassListFluentImpl.ItemsNestedImpl();
  }

  public V1alpha1RuntimeClassListFluent.ItemsNested<A> addNewItemLike(
      io.kubernetes.client.openapi.models.V1alpha1RuntimeClass item) {
    return new V1alpha1RuntimeClassListFluentImpl.ItemsNestedImpl(-1, item);
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassListFluent.ItemsNested<A>
      setNewItemLike(
          java.lang.Integer index, io.kubernetes.client.openapi.models.V1alpha1RuntimeClass item) {
    return new io.kubernetes.client.openapi.models.V1alpha1RuntimeClassListFluentImpl
        .ItemsNestedImpl(index, item);
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassListFluent.ItemsNested<A> editItem(
      java.lang.Integer index) {
    if (items.size() <= index) throw new RuntimeException("Can't edit items. Index exceeds size.");
    return setNewItemLike(index, buildItem(index));
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassListFluent.ItemsNested<A>
      editFirstItem() {
    if (items.size() == 0) throw new RuntimeException("Can't edit first items. The list is empty.");
    return setNewItemLike(0, buildItem(0));
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassListFluent.ItemsNested<A>
      editLastItem() {
    int index = items.size() - 1;
    if (index < 0) throw new RuntimeException("Can't edit last items. The list is empty.");
    return setNewItemLike(index, buildItem(index));
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassListFluent.ItemsNested<A>
      editMatchingItem(
          java.util.function.Predicate<
                  io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder>
              predicate) {
    int index = -1;
    for (int i = 0; i < items.size(); i++) {
      if (predicate.test(items.get(i))) {
        index = i;
        break;
      }
    }
    if (index < 0) throw new RuntimeException("Can't edit matching items. No match found.");
    return setNewItemLike(index, buildItem(index));
  }

  public java.lang.String getKind() {
    return this.kind;
  }

  public A withKind(java.lang.String kind) {
    this.kind = kind;
    return (A) this;
  }

  public java.lang.Boolean hasKind() {
    return this.kind != null;
  }

  /**
   * This method has been deprecated, please use method buildMetadata instead.
   *
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V1ListMeta getMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public io.kubernetes.client.openapi.models.V1ListMeta buildMetadata() {
    return this.metadata != null ? this.metadata.build() : null;
  }

  public A withMetadata(io.kubernetes.client.openapi.models.V1ListMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata != null) {
      this.metadata = new V1ListMetaBuilder(metadata);
      _visitables.get("metadata").add(this.metadata);
    }
    return (A) this;
  }

  public java.lang.Boolean hasMetadata() {
    return this.metadata != null;
  }

  public V1alpha1RuntimeClassListFluent.MetadataNested<A> withNewMetadata() {
    return new V1alpha1RuntimeClassListFluentImpl.MetadataNestedImpl();
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassListFluent.MetadataNested<A>
      withNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item) {
    return new io.kubernetes.client.openapi.models.V1alpha1RuntimeClassListFluentImpl
        .MetadataNestedImpl(item);
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassListFluent.MetadataNested<A>
      editMetadata() {
    return withNewMetadataLike(getMetadata());
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassListFluent.MetadataNested<A>
      editOrNewMetadata() {
    return withNewMetadataLike(
        getMetadata() != null
            ? getMetadata()
            : new io.kubernetes.client.openapi.models.V1ListMetaBuilder().build());
  }

  public io.kubernetes.client.openapi.models.V1alpha1RuntimeClassListFluent.MetadataNested<A>
      editOrNewMetadataLike(io.kubernetes.client.openapi.models.V1ListMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata() : item);
  }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    V1alpha1RuntimeClassListFluentImpl that = (V1alpha1RuntimeClassListFluentImpl) o;
    if (apiVersion != null ? !apiVersion.equals(that.apiVersion) : that.apiVersion != null)
      return false;
    if (items != null ? !items.equals(that.items) : that.items != null) return false;
    if (kind != null ? !kind.equals(that.kind) : that.kind != null) return false;
    if (metadata != null ? !metadata.equals(that.metadata) : that.metadata != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(apiVersion, items, kind, metadata, super.hashCode());
  }

  public java.lang.String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) {
      sb.append("apiVersion:");
      sb.append(apiVersion + ",");
    }
    if (items != null && !items.isEmpty()) {
      sb.append("items:");
      sb.append(items + ",");
    }
    if (kind != null) {
      sb.append("kind:");
      sb.append(kind + ",");
    }
    if (metadata != null) {
      sb.append("metadata:");
      sb.append(metadata);
    }
    sb.append("}");
    return sb.toString();
  }

  class ItemsNestedImpl<N>
      extends V1alpha1RuntimeClassFluentImpl<V1alpha1RuntimeClassListFluent.ItemsNested<N>>
      implements V1alpha1RuntimeClassListFluent.ItemsNested<N>, Nested<N> {
    ItemsNestedImpl(
        java.lang.Integer index, io.kubernetes.client.openapi.models.V1alpha1RuntimeClass item) {
      this.index = index;
      this.builder = new V1alpha1RuntimeClassBuilder(this, item);
    }

    ItemsNestedImpl() {
      this.index = -1;
      this.builder = new io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1alpha1RuntimeClassBuilder builder;
    java.lang.Integer index;

    public N and() {
      return (N) V1alpha1RuntimeClassListFluentImpl.this.setToItems(index, builder.build());
    }

    public N endItem() {
      return and();
    }
  }

  class MetadataNestedImpl<N>
      extends V1ListMetaFluentImpl<V1alpha1RuntimeClassListFluent.MetadataNested<N>>
      implements io.kubernetes.client.openapi.models.V1alpha1RuntimeClassListFluent.MetadataNested<
              N>,
          io.kubernetes.client.fluent.Nested<N> {
    MetadataNestedImpl(V1ListMeta item) {
      this.builder = new V1ListMetaBuilder(this, item);
    }

    MetadataNestedImpl() {
      this.builder = new io.kubernetes.client.openapi.models.V1ListMetaBuilder(this);
    }

    io.kubernetes.client.openapi.models.V1ListMetaBuilder builder;

    public N and() {
      return (N) V1alpha1RuntimeClassListFluentImpl.this.withMetadata(builder.build());
    }

    public N endMetadata() {
      return and();
    }
  }
}
