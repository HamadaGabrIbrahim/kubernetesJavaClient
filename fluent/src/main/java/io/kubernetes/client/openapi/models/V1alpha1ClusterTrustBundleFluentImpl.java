package io.kubernetes.client.openapi.models;

import java.lang.SuppressWarnings;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Deprecated;
import io.kubernetes.client.fluent.BaseFluent;
import java.lang.Object;
import java.lang.Boolean;

 /**
  * Generated
  */
  @SuppressWarnings(value = "unchecked")
  public class V1alpha1ClusterTrustBundleFluentImpl<A extends V1alpha1ClusterTrustBundleFluent<A>> extends BaseFluent<A> implements V1alpha1ClusterTrustBundleFluent<A>{
  public V1alpha1ClusterTrustBundleFluentImpl() {
  }
  public V1alpha1ClusterTrustBundleFluentImpl(V1alpha1ClusterTrustBundle instance) {
    if (instance != null) {
      this.withApiVersion(instance.getApiVersion());
      this.withKind(instance.getKind());
      this.withMetadata(instance.getMetadata());
      this.withSpec(instance.getSpec());
    }
  }
  private String apiVersion;
  private String kind;
  private V1ObjectMetaBuilder metadata;
  private V1alpha1ClusterTrustBundleSpecBuilder spec;
  public String getApiVersion() {
    return this.apiVersion;
  }
  public A withApiVersion(String apiVersion) {
    this.apiVersion=apiVersion; return (A) this;
  }
  public Boolean hasApiVersion() {
    return this.apiVersion != null;
  }
  public String getKind() {
    return this.kind;
  }
  public A withKind(String kind) {
    this.kind=kind; return (A) this;
  }
  public Boolean hasKind() {
    return this.kind != null;
  }
  
  /**
   * This method has been deprecated, please use method buildMetadata instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1ObjectMeta getMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public V1ObjectMeta buildMetadata() {
    return this.metadata!=null ?this.metadata.build():null;
  }
  public A withMetadata(V1ObjectMeta metadata) {
    _visitables.get("metadata").remove(this.metadata);
    if (metadata!=null){ this.metadata= new V1ObjectMetaBuilder(metadata); _visitables.get("metadata").add(this.metadata);} else { this.metadata = null; _visitables.get("metadata").remove(this.metadata); } return (A) this;
  }
  public Boolean hasMetadata() {
    return this.metadata != null;
  }
  public V1alpha1ClusterTrustBundleFluentImpl.MetadataNested<A> withNewMetadata() {
    return new V1alpha1ClusterTrustBundleFluentImpl.MetadataNestedImpl();
  }
  public V1alpha1ClusterTrustBundleFluentImpl.MetadataNested<A> withNewMetadataLike(V1ObjectMeta item) {
    return new V1alpha1ClusterTrustBundleFluentImpl.MetadataNestedImpl(item);
  }
  public V1alpha1ClusterTrustBundleFluentImpl.MetadataNested<A> editMetadata() {
    return withNewMetadataLike(getMetadata());
  }
  public V1alpha1ClusterTrustBundleFluentImpl.MetadataNested<A> editOrNewMetadata() {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): new V1ObjectMetaBuilder().build());
  }
  public V1alpha1ClusterTrustBundleFluentImpl.MetadataNested<A> editOrNewMetadataLike(V1ObjectMeta item) {
    return withNewMetadataLike(getMetadata() != null ? getMetadata(): item);
  }
  
  /**
   * This method has been deprecated, please use method buildSpec instead.
   * @return The buildable object.
   */
  @Deprecated
  public V1alpha1ClusterTrustBundleSpec getSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public V1alpha1ClusterTrustBundleSpec buildSpec() {
    return this.spec!=null ?this.spec.build():null;
  }
  public A withSpec(V1alpha1ClusterTrustBundleSpec spec) {
    _visitables.get("spec").remove(this.spec);
    if (spec!=null){ this.spec= new V1alpha1ClusterTrustBundleSpecBuilder(spec); _visitables.get("spec").add(this.spec);} else { this.spec = null; _visitables.get("spec").remove(this.spec); } return (A) this;
  }
  public Boolean hasSpec() {
    return this.spec != null;
  }
  public V1alpha1ClusterTrustBundleFluentImpl.SpecNested<A> withNewSpec() {
    return new V1alpha1ClusterTrustBundleFluentImpl.SpecNestedImpl();
  }
  public V1alpha1ClusterTrustBundleFluentImpl.SpecNested<A> withNewSpecLike(V1alpha1ClusterTrustBundleSpec item) {
    return new V1alpha1ClusterTrustBundleFluentImpl.SpecNestedImpl(item);
  }
  public V1alpha1ClusterTrustBundleFluentImpl.SpecNested<A> editSpec() {
    return withNewSpecLike(getSpec());
  }
  public V1alpha1ClusterTrustBundleFluentImpl.SpecNested<A> editOrNewSpec() {
    return withNewSpecLike(getSpec() != null ? getSpec(): new V1alpha1ClusterTrustBundleSpecBuilder().build());
  }
  public V1alpha1ClusterTrustBundleFluentImpl.SpecNested<A> editOrNewSpecLike(V1alpha1ClusterTrustBundleSpec item) {
    return withNewSpecLike(getSpec() != null ? getSpec(): item);
  }
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1alpha1ClusterTrustBundleFluentImpl that = (V1alpha1ClusterTrustBundleFluentImpl) o;
    if (!java.util.Objects.equals(apiVersion, that.apiVersion)) return false;

    if (!java.util.Objects.equals(kind, that.kind)) return false;

    if (!java.util.Objects.equals(metadata, that.metadata)) return false;

    if (!java.util.Objects.equals(spec, that.spec)) return false;

    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(apiVersion,  kind,  metadata,  spec,  super.hashCode());
  }
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    if (apiVersion != null) { sb.append("apiVersion:"); sb.append(apiVersion + ","); }
    if (kind != null) { sb.append("kind:"); sb.append(kind + ","); }
    if (metadata != null) { sb.append("metadata:"); sb.append(metadata + ","); }
    if (spec != null) { sb.append("spec:"); sb.append(spec); }
    sb.append("}");
    return sb.toString();
  }
  class MetadataNestedImpl<N> extends V1ObjectMetaFluentImpl<V1alpha1ClusterTrustBundleFluentImpl.MetadataNested<N>> implements V1alpha1ClusterTrustBundleFluentImpl.MetadataNested<N>,Nested<N>{
    MetadataNestedImpl(V1ObjectMeta item) {
      this.builder = new V1ObjectMetaBuilder(this, item);
    }
    MetadataNestedImpl() {
      this.builder = new V1ObjectMetaBuilder(this);
    }
    V1ObjectMetaBuilder builder;
    public N and() {
      return (N) V1alpha1ClusterTrustBundleFluentImpl.this.withMetadata(builder.build());
    }
    public N endMetadata() {
      return and();
    }
    
  }
  class SpecNestedImpl<N> extends V1alpha1ClusterTrustBundleSpecFluentImpl<V1alpha1ClusterTrustBundleFluentImpl.SpecNested<N>> implements V1alpha1ClusterTrustBundleFluentImpl.SpecNested<N>,Nested<N>{
    SpecNestedImpl(V1alpha1ClusterTrustBundleSpec item) {
      this.builder = new V1alpha1ClusterTrustBundleSpecBuilder(this, item);
    }
    SpecNestedImpl() {
      this.builder = new V1alpha1ClusterTrustBundleSpecBuilder(this);
    }
    V1alpha1ClusterTrustBundleSpecBuilder builder;
    public N and() {
      return (N) V1alpha1ClusterTrustBundleFluentImpl.this.withSpec(builder.build());
    }
    public N endSpec() {
      return and();
    }
    
  }
  
}