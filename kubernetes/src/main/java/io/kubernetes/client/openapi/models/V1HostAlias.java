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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the
 * pod&#39;s hosts file.
 */
@ApiModel(
    description =
        "HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.")
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen",
    date = "2022-04-08T04:59:41.589Z[Etc/UTC]")
public class V1HostAlias {
  public static final String SERIALIZED_NAME_HOSTNAMES = "hostnames";

  @SerializedName(SERIALIZED_NAME_HOSTNAMES)
  private List<String> hostnames = null;

  public static final String SERIALIZED_NAME_IP = "ip";

  @SerializedName(SERIALIZED_NAME_IP)
  private String ip;

  public V1HostAlias hostnames(List<String> hostnames) {

    this.hostnames = hostnames;
    return this;
  }

  public V1HostAlias addHostnamesItem(String hostnamesItem) {
    if (this.hostnames == null) {
      this.hostnames = new ArrayList<>();
    }
    this.hostnames.add(hostnamesItem);
    return this;
  }

  /**
   * Hostnames for the above IP address.
   *
   * @return hostnames
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hostnames for the above IP address.")
  public List<String> getHostnames() {
    return hostnames;
  }

  public void setHostnames(List<String> hostnames) {
    this.hostnames = hostnames;
  }

  public V1HostAlias ip(String ip) {

    this.ip = ip;
    return this;
  }

  /**
   * IP address of the host file entry.
   *
   * @return ip
   */
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IP address of the host file entry.")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1HostAlias v1HostAlias = (V1HostAlias) o;
    return Objects.equals(this.hostnames, v1HostAlias.hostnames)
        && Objects.equals(this.ip, v1HostAlias.ip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostnames, ip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1HostAlias {\n");
    sb.append("    hostnames: ").append(toIndentedString(hostnames)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
