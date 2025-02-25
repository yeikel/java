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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * PodsMetricStatus indicates the current value of a metric describing each pod in the current scale
 * target (for example, transactions-processed-per-second).
 */
@ApiModel(
    description =
        "PodsMetricStatus indicates the current value of a metric describing each pod in the current scale target (for example, transactions-processed-per-second).")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-04-08T04:59:41.589Z[Etc/UTC]")
public class V2PodsMetricStatus {
  public static final String SERIALIZED_NAME_CURRENT = "current";

  @SerializedName(SERIALIZED_NAME_CURRENT)
  private V2MetricValueStatus current;

  public static final String SERIALIZED_NAME_METRIC = "metric";

  @SerializedName(SERIALIZED_NAME_METRIC)
  private V2MetricIdentifier metric;

  public V2PodsMetricStatus current(V2MetricValueStatus current) {

    this.current = current;
    return this;
  }

  /**
   * Get current
   *
   * @return current
   */
  @ApiModelProperty(required = true, value = "")
  public V2MetricValueStatus getCurrent() {
    return current;
  }

  public void setCurrent(V2MetricValueStatus current) {
    this.current = current;
  }

  public V2PodsMetricStatus metric(V2MetricIdentifier metric) {

    this.metric = metric;
    return this;
  }

  /**
   * Get metric
   *
   * @return metric
   */
  @ApiModelProperty(required = true, value = "")
  public V2MetricIdentifier getMetric() {
    return metric;
  }

  public void setMetric(V2MetricIdentifier metric) {
    this.metric = metric;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2PodsMetricStatus v2PodsMetricStatus = (V2PodsMetricStatus) o;
    return Objects.equals(this.current, v2PodsMetricStatus.current)
        && Objects.equals(this.metric, v2PodsMetricStatus.metric);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, metric);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2PodsMetricStatus {\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
