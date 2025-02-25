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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Secret holds secret data of a certain type. The total bytes of the values in the Data field must
 * be less than MaxSecretSize bytes.
 */
@ApiModel(
    description =
        "Secret holds secret data of a certain type. The total bytes of the values in the Data field must be less than MaxSecretSize bytes.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-04-08T04:59:41.589Z[Etc/UTC]")
public class V1Secret implements io.kubernetes.client.common.KubernetesObject {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";

  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_DATA = "data";

  @SerializedName(SERIALIZED_NAME_DATA)
  private Map<String, byte[]> data = null;

  public static final String SERIALIZED_NAME_IMMUTABLE = "immutable";

  @SerializedName(SERIALIZED_NAME_IMMUTABLE)
  private Boolean immutable;

  public static final String SERIALIZED_NAME_KIND = "kind";

  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";

  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_STRING_DATA = "stringData";

  @SerializedName(SERIALIZED_NAME_STRING_DATA)
  private Map<String, String> stringData = null;

  public static final String SERIALIZED_NAME_TYPE = "type";

  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public V1Secret apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should
   * convert recognized schemas to the latest internal value, and may reject unrecognized values.
   * More info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   *
   * @return apiVersion
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public V1Secret data(Map<String, byte[]> data) {

    this.data = data;
    return this;
  }

  public V1Secret putDataItem(String key, byte[] dataItem) {
    if (this.data == null) {
      this.data = new HashMap<>();
    }
    this.data.put(key, dataItem);
    return this;
  }

  /**
   * Data contains the secret data. Each key must consist of alphanumeric characters, &#39;-&#39;,
   * &#39;_&#39; or &#39;.&#39;. The serialized form of the secret data is a base64 encoded string,
   * representing the arbitrary (possibly non-string) data value here. Described in
   * https://tools.ietf.org/html/rfc4648#section-4
   *
   * @return data
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Data contains the secret data. Each key must consist of alphanumeric characters, '-', '_' or '.'. The serialized form of the secret data is a base64 encoded string, representing the arbitrary (possibly non-string) data value here. Described in https://tools.ietf.org/html/rfc4648#section-4")
  public Map<String, byte[]> getData() {
    return data;
  }

  public void setData(Map<String, byte[]> data) {
    this.data = data;
  }

  public V1Secret immutable(Boolean immutable) {

    this.immutable = immutable;
    return this;
  }

  /**
   * Immutable, if set to true, ensures that data stored in the Secret cannot be updated (only
   * object metadata can be modified). If not set to true, the field can be modified at any time.
   * Defaulted to nil.
   *
   * @return immutable
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Immutable, if set to true, ensures that data stored in the Secret cannot be updated (only object metadata can be modified). If not set to true, the field can be modified at any time. Defaulted to nil.")
  public Boolean getImmutable() {
    return immutable;
  }

  public void setImmutable(Boolean immutable) {
    this.immutable = immutable;
  }

  public V1Secret kind(String kind) {

    this.kind = kind;
    return this;
  }

  /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer
   * this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More
   * info:
   * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   *
   * @return kind
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public V1Secret metadata(V1ObjectMeta metadata) {

    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   *
   * @return metadata
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  public V1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public V1Secret stringData(Map<String, String> stringData) {

    this.stringData = stringData;
    return this;
  }

  public V1Secret putStringDataItem(String key, String stringDataItem) {
    if (this.stringData == null) {
      this.stringData = new HashMap<>();
    }
    this.stringData.put(key, stringDataItem);
    return this;
  }

  /**
   * stringData allows specifying non-binary secret data in string form. It is provided as a
   * write-only input field for convenience. All keys and values are merged into the data field on
   * write, overwriting any existing values. The stringData field is never output when reading from
   * the API.
   *
   * @return stringData
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "stringData allows specifying non-binary secret data in string form. It is provided as a write-only input field for convenience. All keys and values are merged into the data field on write, overwriting any existing values. The stringData field is never output when reading from the API.")
  public Map<String, String> getStringData() {
    return stringData;
  }

  public void setStringData(Map<String, String> stringData) {
    this.stringData = stringData;
  }

  public V1Secret type(String type) {

    this.type = type;
    return this;
  }

  /**
   * Used to facilitate programmatic handling of secret data. More info:
   * https://kubernetes.io/docs/concepts/configuration/secret/#secret-types
   *
   * @return type
   */
  @javax.annotation.Nullable
  @ApiModelProperty(
      value =
          "Used to facilitate programmatic handling of secret data. More info: https://kubernetes.io/docs/concepts/configuration/secret/#secret-types")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Secret v1Secret = (V1Secret) o;
    return Objects.equals(this.apiVersion, v1Secret.apiVersion)
        && Objects.equals(this.data, v1Secret.data)
        && Objects.equals(this.immutable, v1Secret.immutable)
        && Objects.equals(this.kind, v1Secret.kind)
        && Objects.equals(this.metadata, v1Secret.metadata)
        && Objects.equals(this.stringData, v1Secret.stringData)
        && Objects.equals(this.type, v1Secret.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, data, immutable, kind, metadata, stringData, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Secret {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    immutable: ").append(toIndentedString(immutable)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    stringData: ").append(toIndentedString(stringData)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
