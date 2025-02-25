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

import io.kubernetes.client.fluent.VisitableBuilder;

public class V1TopologySpreadConstraintBuilder
    extends V1TopologySpreadConstraintFluentImpl<V1TopologySpreadConstraintBuilder>
    implements VisitableBuilder<
        io.kubernetes.client.openapi.models.V1TopologySpreadConstraint,
        io.kubernetes.client.openapi.models.V1TopologySpreadConstraintBuilder> {
  public V1TopologySpreadConstraintBuilder() {
    this(false);
  }

  public V1TopologySpreadConstraintBuilder(Boolean validationEnabled) {
    this(new V1TopologySpreadConstraint(), validationEnabled);
  }

  public V1TopologySpreadConstraintBuilder(V1TopologySpreadConstraintFluent<?> fluent) {
    this(fluent, false);
  }

  public V1TopologySpreadConstraintBuilder(
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1TopologySpreadConstraint(), validationEnabled);
  }

  public V1TopologySpreadConstraintBuilder(
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraint instance) {
    this(fluent, instance, false);
  }

  public V1TopologySpreadConstraintBuilder(
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraint instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withLabelSelector(instance.getLabelSelector());

    fluent.withMaxSkew(instance.getMaxSkew());

    fluent.withTopologyKey(instance.getTopologyKey());

    fluent.withWhenUnsatisfiable(instance.getWhenUnsatisfiable());

    this.validationEnabled = validationEnabled;
  }

  public V1TopologySpreadConstraintBuilder(
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraint instance) {
    this(instance, false);
  }

  public V1TopologySpreadConstraintBuilder(
      io.kubernetes.client.openapi.models.V1TopologySpreadConstraint instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withLabelSelector(instance.getLabelSelector());

    this.withMaxSkew(instance.getMaxSkew());

    this.withTopologyKey(instance.getTopologyKey());

    this.withWhenUnsatisfiable(instance.getWhenUnsatisfiable());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1TopologySpreadConstraintFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1TopologySpreadConstraint build() {
    V1TopologySpreadConstraint buildable = new V1TopologySpreadConstraint();
    buildable.setLabelSelector(fluent.getLabelSelector());
    buildable.setMaxSkew(fluent.getMaxSkew());
    buildable.setTopologyKey(fluent.getTopologyKey());
    buildable.setWhenUnsatisfiable(fluent.getWhenUnsatisfiable());
    return buildable;
  }
}
