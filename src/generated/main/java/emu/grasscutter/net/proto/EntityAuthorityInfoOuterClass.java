// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class EntityAuthorityInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_EntityAuthorityInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EntityAuthorityInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EntityAuthorityInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EntityAuthorityInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019EntityAuthorityInfo.proto\u001a\u001aAbilitySyncStateInfo.proto\u001a$AnimatorParameterValueInfoPair.proto\u001a\u001fEntityRendererChangedInfo.proto\u001a\u0017SceneEntityAiInfo.proto\u001a\fVector.proto\"\u00f6\u0001\n\u0013EntityAuthorityInfo\u0012+\n\fability_info\u0018\u0001 \u0001(\u000b2\u0015.AbilitySyncStateInfo\u00129\n\u0015renderer_changed_info\u0018\u0002 \u0001(\u000b2\u001a.EntityRendererChangedInfo\u0012#\n\u0007ai_info\u0018\u0003 \u0001(\u000b2\u0012.SceneEntityAiInfo\u0012\u0019\n\bborn_pos\u0018\u0004 \u0001(\u000b2\u0007.Vector\u00127\n\u000epose_para_list\u0018\u0005 \u0003(\u000b2\u001f.AnimatorParameterValueInfoPairB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EntityAuthorityInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AbilitySyncStateInfoOuterClass.getDescriptor(), AnimatorParameterValueInfoPairOuterClass.getDescriptor(), EntityRendererChangedInfoOuterClass.getDescriptor(), SceneEntityAiInfoOuterClass.getDescriptor(), VectorOuterClass.getDescriptor() });
        internal_static_EntityAuthorityInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EntityAuthorityInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EntityAuthorityInfoOuterClass.internal_static_EntityAuthorityInfo_descriptor, new String[] { "AbilityInfo", "RendererChangedInfo", "AiInfo", "BornPos", "PoseParaList" });
        AbilitySyncStateInfoOuterClass.getDescriptor();
        AnimatorParameterValueInfoPairOuterClass.getDescriptor();
        EntityRendererChangedInfoOuterClass.getDescriptor();
        SceneEntityAiInfoOuterClass.getDescriptor();
        VectorOuterClass.getDescriptor();
    }
    
    public static final class EntityAuthorityInfo extends GeneratedMessageV3 implements EntityAuthorityInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ABILITY_INFO_FIELD_NUMBER = 1;
        private AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo abilityInfo_;
        public static final int RENDERER_CHANGED_INFO_FIELD_NUMBER = 2;
        private EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo rendererChangedInfo_;
        public static final int AI_INFO_FIELD_NUMBER = 3;
        private SceneEntityAiInfoOuterClass.SceneEntityAiInfo aiInfo_;
        public static final int BORN_POS_FIELD_NUMBER = 4;
        private VectorOuterClass.Vector bornPos_;
        public static final int POSE_PARA_LIST_FIELD_NUMBER = 5;
        private List<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair> poseParaList_;
        private byte memoizedIsInitialized;
        private static final EntityAuthorityInfo DEFAULT_INSTANCE;
        private static final Parser<EntityAuthorityInfo> PARSER;
        
        private EntityAuthorityInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EntityAuthorityInfo() {
            this.memoizedIsInitialized = -1;
            this.poseParaList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EntityAuthorityInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EntityAuthorityInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
            int mutable_bitField0_ = 0;
            final UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    final int tag = input.readTag();
                    switch (tag) {
                        case 0: {
                            done = true;
                            continue;
                        }
                        case 10: {
                            AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder subBuilder = null;
                            if (this.abilityInfo_ != null) {
                                subBuilder = this.abilityInfo_.toBuilder();
                            }
                            this.abilityInfo_ = input.readMessage(AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.abilityInfo_);
                                this.abilityInfo_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 18: {
                            EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.Builder subBuilder2 = null;
                            if (this.rendererChangedInfo_ != null) {
                                subBuilder2 = this.rendererChangedInfo_.toBuilder();
                            }
                            this.rendererChangedInfo_ = input.readMessage(EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.parser(), extensionRegistry);
                            if (subBuilder2 != null) {
                                subBuilder2.mergeFrom(this.rendererChangedInfo_);
                                this.rendererChangedInfo_ = subBuilder2.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 26: {
                            SceneEntityAiInfoOuterClass.SceneEntityAiInfo.Builder subBuilder3 = null;
                            if (this.aiInfo_ != null) {
                                subBuilder3 = this.aiInfo_.toBuilder();
                            }
                            this.aiInfo_ = input.readMessage(SceneEntityAiInfoOuterClass.SceneEntityAiInfo.parser(), extensionRegistry);
                            if (subBuilder3 != null) {
                                subBuilder3.mergeFrom(this.aiInfo_);
                                this.aiInfo_ = subBuilder3.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 34: {
                            VectorOuterClass.Vector.Builder subBuilder4 = null;
                            if (this.bornPos_ != null) {
                                subBuilder4 = this.bornPos_.toBuilder();
                            }
                            this.bornPos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder4 != null) {
                                subBuilder4.mergeFrom(this.bornPos_);
                                this.bornPos_ = subBuilder4.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 42: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.poseParaList_ = new ArrayList<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.poseParaList_.add(input.readMessage(AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.parser(), extensionRegistry));
                            continue;
                        }
                        default: {
                            if (!this.parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                done = true;
                                continue;
                            }
                            continue;
                        }
                    }
                }
            }
            catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            }
            catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2).setUnfinishedMessage(this);
            }
            finally {
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.poseParaList_ = Collections.unmodifiableList((List<? extends AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair>)this.poseParaList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return EntityAuthorityInfoOuterClass.internal_static_EntityAuthorityInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EntityAuthorityInfoOuterClass.internal_static_EntityAuthorityInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EntityAuthorityInfo.class, Builder.class);
        }
        
        @Override
        public boolean hasAbilityInfo() {
            return this.abilityInfo_ != null;
        }
        
        @Override
        public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo() {
            return (this.abilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.abilityInfo_;
        }
        
        @Override
        public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder() {
            return this.getAbilityInfo();
        }
        
        @Override
        public boolean hasRendererChangedInfo() {
            return this.rendererChangedInfo_ != null;
        }
        
        @Override
        public EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo getRendererChangedInfo() {
            return (this.rendererChangedInfo_ == null) ? EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.getDefaultInstance() : this.rendererChangedInfo_;
        }
        
        @Override
        public EntityRendererChangedInfoOuterClass.EntityRendererChangedInfoOrBuilder getRendererChangedInfoOrBuilder() {
            return this.getRendererChangedInfo();
        }
        
        @Override
        public boolean hasAiInfo() {
            return this.aiInfo_ != null;
        }
        
        @Override
        public SceneEntityAiInfoOuterClass.SceneEntityAiInfo getAiInfo() {
            return (this.aiInfo_ == null) ? SceneEntityAiInfoOuterClass.SceneEntityAiInfo.getDefaultInstance() : this.aiInfo_;
        }
        
        @Override
        public SceneEntityAiInfoOuterClass.SceneEntityAiInfoOrBuilder getAiInfoOrBuilder() {
            return this.getAiInfo();
        }
        
        @Override
        public boolean hasBornPos() {
            return this.bornPos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getBornPos() {
            return (this.bornPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.bornPos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getBornPosOrBuilder() {
            return this.getBornPos();
        }
        
        @Override
        public List<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair> getPoseParaListList() {
            return this.poseParaList_;
        }
        
        @Override
        public List<? extends AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder> getPoseParaListOrBuilderList() {
            return this.poseParaList_;
        }
        
        @Override
        public int getPoseParaListCount() {
            return this.poseParaList_.size();
        }
        
        @Override
        public AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair getPoseParaList(final int index) {
            return this.poseParaList_.get(index);
        }
        
        @Override
        public AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder getPoseParaListOrBuilder(final int index) {
            return this.poseParaList_.get(index);
        }
        
        @Override
        public final boolean isInitialized() {
            final byte isInitialized = this.memoizedIsInitialized;
            if (isInitialized == 1) {
                return true;
            }
            if (isInitialized == 0) {
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        
        @Override
        public void writeTo(final CodedOutputStream output) throws IOException {
            if (this.abilityInfo_ != null) {
                output.writeMessage(1, this.getAbilityInfo());
            }
            if (this.rendererChangedInfo_ != null) {
                output.writeMessage(2, this.getRendererChangedInfo());
            }
            if (this.aiInfo_ != null) {
                output.writeMessage(3, this.getAiInfo());
            }
            if (this.bornPos_ != null) {
                output.writeMessage(4, this.getBornPos());
            }
            for (int i = 0; i < this.poseParaList_.size(); ++i) {
                output.writeMessage(5, this.poseParaList_.get(i));
            }
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            if (this.abilityInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(1, this.getAbilityInfo());
            }
            if (this.rendererChangedInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(2, this.getRendererChangedInfo());
            }
            if (this.aiInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(3, this.getAiInfo());
            }
            if (this.bornPos_ != null) {
                size += CodedOutputStream.computeMessageSize(4, this.getBornPos());
            }
            for (int i = 0; i < this.poseParaList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(5, this.poseParaList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EntityAuthorityInfo)) {
                return super.equals(obj);
            }
            final EntityAuthorityInfo other = (EntityAuthorityInfo)obj;
            return this.hasAbilityInfo() == other.hasAbilityInfo() && (!this.hasAbilityInfo() || this.getAbilityInfo().equals(other.getAbilityInfo())) && this.hasRendererChangedInfo() == other.hasRendererChangedInfo() && (!this.hasRendererChangedInfo() || this.getRendererChangedInfo().equals(other.getRendererChangedInfo())) && this.hasAiInfo() == other.hasAiInfo() && (!this.hasAiInfo() || this.getAiInfo().equals(other.getAiInfo())) && this.hasBornPos() == other.hasBornPos() && (!this.hasBornPos() || this.getBornPos().equals(other.getBornPos())) && this.getPoseParaListList().equals(other.getPoseParaListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.hasAbilityInfo()) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getAbilityInfo().hashCode();
            }
            if (this.hasRendererChangedInfo()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getRendererChangedInfo().hashCode();
            }
            if (this.hasAiInfo()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getAiInfo().hashCode();
            }
            if (this.hasBornPos()) {
                hash = 37 * hash + 4;
                hash = 53 * hash + this.getBornPos().hashCode();
            }
            if (this.getPoseParaListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getPoseParaListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EntityAuthorityInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EntityAuthorityInfo.PARSER.parseFrom(data);
        }
        
        public static EntityAuthorityInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityAuthorityInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityAuthorityInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EntityAuthorityInfo.PARSER.parseFrom(data);
        }
        
        public static EntityAuthorityInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityAuthorityInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityAuthorityInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EntityAuthorityInfo.PARSER.parseFrom(data);
        }
        
        public static EntityAuthorityInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EntityAuthorityInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EntityAuthorityInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityAuthorityInfo.PARSER, input);
        }
        
        public static EntityAuthorityInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityAuthorityInfo.PARSER, input, extensionRegistry);
        }
        
        public static EntityAuthorityInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EntityAuthorityInfo.PARSER, input);
        }
        
        public static EntityAuthorityInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EntityAuthorityInfo.PARSER, input, extensionRegistry);
        }
        
        public static EntityAuthorityInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityAuthorityInfo.PARSER, input);
        }
        
        public static EntityAuthorityInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EntityAuthorityInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EntityAuthorityInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EntityAuthorityInfo prototype) {
            return EntityAuthorityInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EntityAuthorityInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EntityAuthorityInfo getDefaultInstance() {
            return EntityAuthorityInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<EntityAuthorityInfo> parser() {
            return EntityAuthorityInfo.PARSER;
        }
        
        @Override
        public Parser<EntityAuthorityInfo> getParserForType() {
            return EntityAuthorityInfo.PARSER;
        }
        
        @Override
        public EntityAuthorityInfo getDefaultInstanceForType() {
            return EntityAuthorityInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EntityAuthorityInfo();
            PARSER = new AbstractParser<EntityAuthorityInfo>() {
                @Override
                public EntityAuthorityInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EntityAuthorityInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EntityAuthorityInfoOrBuilder
        {
            private int bitField0_;
            private AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo abilityInfo_;
            private SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> abilityInfoBuilder_;
            private EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo rendererChangedInfo_;
            private SingleFieldBuilderV3<EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo, EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.Builder, EntityRendererChangedInfoOuterClass.EntityRendererChangedInfoOrBuilder> rendererChangedInfoBuilder_;
            private SceneEntityAiInfoOuterClass.SceneEntityAiInfo aiInfo_;
            private SingleFieldBuilderV3<SceneEntityAiInfoOuterClass.SceneEntityAiInfo, SceneEntityAiInfoOuterClass.SceneEntityAiInfo.Builder, SceneEntityAiInfoOuterClass.SceneEntityAiInfoOrBuilder> aiInfoBuilder_;
            private VectorOuterClass.Vector bornPos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> bornPosBuilder_;
            private List<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair> poseParaList_;
            private RepeatedFieldBuilderV3<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair, AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder, AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder> poseParaListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EntityAuthorityInfoOuterClass.internal_static_EntityAuthorityInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EntityAuthorityInfoOuterClass.internal_static_EntityAuthorityInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(EntityAuthorityInfo.class, Builder.class);
            }
            
            private Builder() {
                this.poseParaList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.poseParaList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EntityAuthorityInfo.alwaysUseFieldBuilders) {
                    this.getPoseParaListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.abilityInfoBuilder_ == null) {
                    this.abilityInfo_ = null;
                }
                else {
                    this.abilityInfo_ = null;
                    this.abilityInfoBuilder_ = null;
                }
                if (this.rendererChangedInfoBuilder_ == null) {
                    this.rendererChangedInfo_ = null;
                }
                else {
                    this.rendererChangedInfo_ = null;
                    this.rendererChangedInfoBuilder_ = null;
                }
                if (this.aiInfoBuilder_ == null) {
                    this.aiInfo_ = null;
                }
                else {
                    this.aiInfo_ = null;
                    this.aiInfoBuilder_ = null;
                }
                if (this.bornPosBuilder_ == null) {
                    this.bornPos_ = null;
                }
                else {
                    this.bornPos_ = null;
                    this.bornPosBuilder_ = null;
                }
                if (this.poseParaListBuilder_ == null) {
                    this.poseParaList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.poseParaListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EntityAuthorityInfoOuterClass.internal_static_EntityAuthorityInfo_descriptor;
            }
            
            @Override
            public EntityAuthorityInfo getDefaultInstanceForType() {
                return EntityAuthorityInfo.getDefaultInstance();
            }
            
            @Override
            public EntityAuthorityInfo build() {
                final EntityAuthorityInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EntityAuthorityInfo buildPartial() {
                final EntityAuthorityInfo result = new EntityAuthorityInfo(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.abilityInfoBuilder_ == null) {
                    result.abilityInfo_ = this.abilityInfo_;
                }
                else {
                    result.abilityInfo_ = this.abilityInfoBuilder_.build();
                }
                if (this.rendererChangedInfoBuilder_ == null) {
                    result.rendererChangedInfo_ = this.rendererChangedInfo_;
                }
                else {
                    result.rendererChangedInfo_ = this.rendererChangedInfoBuilder_.build();
                }
                if (this.aiInfoBuilder_ == null) {
                    result.aiInfo_ = this.aiInfo_;
                }
                else {
                    result.aiInfo_ = this.aiInfoBuilder_.build();
                }
                if (this.bornPosBuilder_ == null) {
                    result.bornPos_ = this.bornPos_;
                }
                else {
                    result.bornPos_ = this.bornPosBuilder_.build();
                }
                if (this.poseParaListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.poseParaList_ = Collections.unmodifiableList((List<? extends AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair>)this.poseParaList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.poseParaList_ = this.poseParaList_;
                }
                else {
                    result.poseParaList_ = this.poseParaListBuilder_.build();
                }
                this.onBuilt();
                return result;
            }
            
            @Override
            public Builder clone() {
                return super.clone();
            }
            
            @Override
            public Builder setField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.setField(field, value);
            }
            
            @Override
            public Builder clearField(final Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            
            @Override
            public Builder clearOneof(final Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            
            @Override
            public Builder setRepeatedField(final Descriptors.FieldDescriptor field, final int index, final Object value) {
                return super.setRepeatedField(field, index, value);
            }
            
            @Override
            public Builder addRepeatedField(final Descriptors.FieldDescriptor field, final Object value) {
                return super.addRepeatedField(field, value);
            }
            
            @Override
            public Builder mergeFrom(final Message other) {
                if (other instanceof EntityAuthorityInfo) {
                    return this.mergeFrom((EntityAuthorityInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EntityAuthorityInfo other) {
                if (other == EntityAuthorityInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.hasAbilityInfo()) {
                    this.mergeAbilityInfo(other.getAbilityInfo());
                }
                if (other.hasRendererChangedInfo()) {
                    this.mergeRendererChangedInfo(other.getRendererChangedInfo());
                }
                if (other.hasAiInfo()) {
                    this.mergeAiInfo(other.getAiInfo());
                }
                if (other.hasBornPos()) {
                    this.mergeBornPos(other.getBornPos());
                }
                if (this.poseParaListBuilder_ == null) {
                    if (!other.poseParaList_.isEmpty()) {
                        if (this.poseParaList_.isEmpty()) {
                            this.poseParaList_ = other.poseParaList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensurePoseParaListIsMutable();
                            this.poseParaList_.addAll(other.poseParaList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.poseParaList_.isEmpty()) {
                    if (this.poseParaListBuilder_.isEmpty()) {
                        this.poseParaListBuilder_.dispose();
                        this.poseParaListBuilder_ = null;
                        this.poseParaList_ = other.poseParaList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.poseParaListBuilder_ = (EntityAuthorityInfo.alwaysUseFieldBuilders ? this.getPoseParaListFieldBuilder() : null);
                    }
                    else {
                        this.poseParaListBuilder_.addAllMessages(other.poseParaList_);
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                this.onChanged();
                return this;
            }
            
            @Override
            public final boolean isInitialized() {
                return true;
            }
            
            @Override
            public Builder mergeFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
                EntityAuthorityInfo parsedMessage = null;
                try {
                    parsedMessage = EntityAuthorityInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EntityAuthorityInfo)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            @Override
            public boolean hasAbilityInfo() {
                return this.abilityInfoBuilder_ != null || this.abilityInfo_ != null;
            }
            
            @Override
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo() {
                if (this.abilityInfoBuilder_ == null) {
                    return (this.abilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.abilityInfo_;
                }
                return this.abilityInfoBuilder_.getMessage();
            }
            
            public Builder setAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
                if (this.abilityInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.abilityInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.abilityInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder builderForValue) {
                if (this.abilityInfoBuilder_ == null) {
                    this.abilityInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.abilityInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeAbilityInfo(final AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo value) {
                if (this.abilityInfoBuilder_ == null) {
                    if (this.abilityInfo_ != null) {
                        this.abilityInfo_ = AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.newBuilder(this.abilityInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.abilityInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.abilityInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearAbilityInfo() {
                if (this.abilityInfoBuilder_ == null) {
                    this.abilityInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.abilityInfo_ = null;
                    this.abilityInfoBuilder_ = null;
                }
                return this;
            }
            
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder getAbilityInfoBuilder() {
                this.onChanged();
                return this.getAbilityInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder() {
                if (this.abilityInfoBuilder_ != null) {
                    return this.abilityInfoBuilder_.getMessageOrBuilder();
                }
                return (this.abilityInfo_ == null) ? AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.getDefaultInstance() : this.abilityInfo_;
            }
            
            private SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> getAbilityInfoFieldBuilder() {
                if (this.abilityInfoBuilder_ == null) {
                    this.abilityInfoBuilder_ = new SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder>(this.getAbilityInfo(), this.getParentForChildren(), this.isClean());
                    this.abilityInfo_ = null;
                }
                return this.abilityInfoBuilder_;
            }
            
            @Override
            public boolean hasRendererChangedInfo() {
                return this.rendererChangedInfoBuilder_ != null || this.rendererChangedInfo_ != null;
            }
            
            @Override
            public EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo getRendererChangedInfo() {
                if (this.rendererChangedInfoBuilder_ == null) {
                    return (this.rendererChangedInfo_ == null) ? EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.getDefaultInstance() : this.rendererChangedInfo_;
                }
                return this.rendererChangedInfoBuilder_.getMessage();
            }
            
            public Builder setRendererChangedInfo(final EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo value) {
                if (this.rendererChangedInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.rendererChangedInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.rendererChangedInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setRendererChangedInfo(final EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.Builder builderForValue) {
                if (this.rendererChangedInfoBuilder_ == null) {
                    this.rendererChangedInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.rendererChangedInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeRendererChangedInfo(final EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo value) {
                if (this.rendererChangedInfoBuilder_ == null) {
                    if (this.rendererChangedInfo_ != null) {
                        this.rendererChangedInfo_ = EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.newBuilder(this.rendererChangedInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.rendererChangedInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.rendererChangedInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearRendererChangedInfo() {
                if (this.rendererChangedInfoBuilder_ == null) {
                    this.rendererChangedInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.rendererChangedInfo_ = null;
                    this.rendererChangedInfoBuilder_ = null;
                }
                return this;
            }
            
            public EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.Builder getRendererChangedInfoBuilder() {
                this.onChanged();
                return this.getRendererChangedInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public EntityRendererChangedInfoOuterClass.EntityRendererChangedInfoOrBuilder getRendererChangedInfoOrBuilder() {
                if (this.rendererChangedInfoBuilder_ != null) {
                    return this.rendererChangedInfoBuilder_.getMessageOrBuilder();
                }
                return (this.rendererChangedInfo_ == null) ? EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.getDefaultInstance() : this.rendererChangedInfo_;
            }
            
            private SingleFieldBuilderV3<EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo, EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.Builder, EntityRendererChangedInfoOuterClass.EntityRendererChangedInfoOrBuilder> getRendererChangedInfoFieldBuilder() {
                if (this.rendererChangedInfoBuilder_ == null) {
                    this.rendererChangedInfoBuilder_ = new SingleFieldBuilderV3<EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo, EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo.Builder, EntityRendererChangedInfoOuterClass.EntityRendererChangedInfoOrBuilder>(this.getRendererChangedInfo(), this.getParentForChildren(), this.isClean());
                    this.rendererChangedInfo_ = null;
                }
                return this.rendererChangedInfoBuilder_;
            }
            
            @Override
            public boolean hasAiInfo() {
                return this.aiInfoBuilder_ != null || this.aiInfo_ != null;
            }
            
            @Override
            public SceneEntityAiInfoOuterClass.SceneEntityAiInfo getAiInfo() {
                if (this.aiInfoBuilder_ == null) {
                    return (this.aiInfo_ == null) ? SceneEntityAiInfoOuterClass.SceneEntityAiInfo.getDefaultInstance() : this.aiInfo_;
                }
                return this.aiInfoBuilder_.getMessage();
            }
            
            public Builder setAiInfo(final SceneEntityAiInfoOuterClass.SceneEntityAiInfo value) {
                if (this.aiInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.aiInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.aiInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setAiInfo(final SceneEntityAiInfoOuterClass.SceneEntityAiInfo.Builder builderForValue) {
                if (this.aiInfoBuilder_ == null) {
                    this.aiInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.aiInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeAiInfo(final SceneEntityAiInfoOuterClass.SceneEntityAiInfo value) {
                if (this.aiInfoBuilder_ == null) {
                    if (this.aiInfo_ != null) {
                        this.aiInfo_ = SceneEntityAiInfoOuterClass.SceneEntityAiInfo.newBuilder(this.aiInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.aiInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.aiInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearAiInfo() {
                if (this.aiInfoBuilder_ == null) {
                    this.aiInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.aiInfo_ = null;
                    this.aiInfoBuilder_ = null;
                }
                return this;
            }
            
            public SceneEntityAiInfoOuterClass.SceneEntityAiInfo.Builder getAiInfoBuilder() {
                this.onChanged();
                return this.getAiInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public SceneEntityAiInfoOuterClass.SceneEntityAiInfoOrBuilder getAiInfoOrBuilder() {
                if (this.aiInfoBuilder_ != null) {
                    return this.aiInfoBuilder_.getMessageOrBuilder();
                }
                return (this.aiInfo_ == null) ? SceneEntityAiInfoOuterClass.SceneEntityAiInfo.getDefaultInstance() : this.aiInfo_;
            }
            
            private SingleFieldBuilderV3<SceneEntityAiInfoOuterClass.SceneEntityAiInfo, SceneEntityAiInfoOuterClass.SceneEntityAiInfo.Builder, SceneEntityAiInfoOuterClass.SceneEntityAiInfoOrBuilder> getAiInfoFieldBuilder() {
                if (this.aiInfoBuilder_ == null) {
                    this.aiInfoBuilder_ = new SingleFieldBuilderV3<SceneEntityAiInfoOuterClass.SceneEntityAiInfo, SceneEntityAiInfoOuterClass.SceneEntityAiInfo.Builder, SceneEntityAiInfoOuterClass.SceneEntityAiInfoOrBuilder>(this.getAiInfo(), this.getParentForChildren(), this.isClean());
                    this.aiInfo_ = null;
                }
                return this.aiInfoBuilder_;
            }
            
            @Override
            public boolean hasBornPos() {
                return this.bornPosBuilder_ != null || this.bornPos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getBornPos() {
                if (this.bornPosBuilder_ == null) {
                    return (this.bornPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.bornPos_;
                }
                return this.bornPosBuilder_.getMessage();
            }
            
            public Builder setBornPos(final VectorOuterClass.Vector value) {
                if (this.bornPosBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.bornPos_ = value;
                    this.onChanged();
                }
                else {
                    this.bornPosBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setBornPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.bornPosBuilder_ == null) {
                    this.bornPos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.bornPosBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeBornPos(final VectorOuterClass.Vector value) {
                if (this.bornPosBuilder_ == null) {
                    if (this.bornPos_ != null) {
                        this.bornPos_ = VectorOuterClass.Vector.newBuilder(this.bornPos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.bornPos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.bornPosBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearBornPos() {
                if (this.bornPosBuilder_ == null) {
                    this.bornPos_ = null;
                    this.onChanged();
                }
                else {
                    this.bornPos_ = null;
                    this.bornPosBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getBornPosBuilder() {
                this.onChanged();
                return this.getBornPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getBornPosOrBuilder() {
                if (this.bornPosBuilder_ != null) {
                    return this.bornPosBuilder_.getMessageOrBuilder();
                }
                return (this.bornPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.bornPos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getBornPosFieldBuilder() {
                if (this.bornPosBuilder_ == null) {
                    this.bornPosBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getBornPos(), this.getParentForChildren(), this.isClean());
                    this.bornPos_ = null;
                }
                return this.bornPosBuilder_;
            }
            
            private void ensurePoseParaListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.poseParaList_ = new ArrayList<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair>(this.poseParaList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair> getPoseParaListList() {
                if (this.poseParaListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair>)this.poseParaList_);
                }
                return this.poseParaListBuilder_.getMessageList();
            }
            
            @Override
            public int getPoseParaListCount() {
                if (this.poseParaListBuilder_ == null) {
                    return this.poseParaList_.size();
                }
                return this.poseParaListBuilder_.getCount();
            }
            
            @Override
            public AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair getPoseParaList(final int index) {
                if (this.poseParaListBuilder_ == null) {
                    return this.poseParaList_.get(index);
                }
                return this.poseParaListBuilder_.getMessage(index);
            }
            
            public Builder setPoseParaList(final int index, final AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair value) {
                if (this.poseParaListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePoseParaListIsMutable();
                    this.poseParaList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.poseParaListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setPoseParaList(final int index, final AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder builderForValue) {
                if (this.poseParaListBuilder_ == null) {
                    this.ensurePoseParaListIsMutable();
                    this.poseParaList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.poseParaListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addPoseParaList(final AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair value) {
                if (this.poseParaListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePoseParaListIsMutable();
                    this.poseParaList_.add(value);
                    this.onChanged();
                }
                else {
                    this.poseParaListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addPoseParaList(final int index, final AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair value) {
                if (this.poseParaListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensurePoseParaListIsMutable();
                    this.poseParaList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.poseParaListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addPoseParaList(final AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder builderForValue) {
                if (this.poseParaListBuilder_ == null) {
                    this.ensurePoseParaListIsMutable();
                    this.poseParaList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.poseParaListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addPoseParaList(final int index, final AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder builderForValue) {
                if (this.poseParaListBuilder_ == null) {
                    this.ensurePoseParaListIsMutable();
                    this.poseParaList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.poseParaListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllPoseParaList(final Iterable<? extends AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair> values) {
                if (this.poseParaListBuilder_ == null) {
                    this.ensurePoseParaListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.poseParaList_);
                    this.onChanged();
                }
                else {
                    this.poseParaListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearPoseParaList() {
                if (this.poseParaListBuilder_ == null) {
                    this.poseParaList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.poseParaListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removePoseParaList(final int index) {
                if (this.poseParaListBuilder_ == null) {
                    this.ensurePoseParaListIsMutable();
                    this.poseParaList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.poseParaListBuilder_.remove(index);
                }
                return this;
            }
            
            public AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder getPoseParaListBuilder(final int index) {
                return this.getPoseParaListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder getPoseParaListOrBuilder(final int index) {
                if (this.poseParaListBuilder_ == null) {
                    return this.poseParaList_.get(index);
                }
                return this.poseParaListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder> getPoseParaListOrBuilderList() {
                if (this.poseParaListBuilder_ != null) {
                    return this.poseParaListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder>)this.poseParaList_);
            }
            
            public AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder addPoseParaListBuilder() {
                return this.getPoseParaListFieldBuilder().addBuilder(AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.getDefaultInstance());
            }
            
            public AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder addPoseParaListBuilder(final int index) {
                return this.getPoseParaListFieldBuilder().addBuilder(index, AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.getDefaultInstance());
            }
            
            public List<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder> getPoseParaListBuilderList() {
                return this.getPoseParaListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair, AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder, AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder> getPoseParaListFieldBuilder() {
                if (this.poseParaListBuilder_ == null) {
                    this.poseParaListBuilder_ = new RepeatedFieldBuilderV3<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair, AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair.Builder, AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder>(this.poseParaList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.poseParaList_ = null;
                }
                return this.poseParaListBuilder_;
            }
            
            @Override
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface EntityAuthorityInfoOrBuilder extends MessageOrBuilder
    {
        boolean hasAbilityInfo();
        
        AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo();
        
        AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder();
        
        boolean hasRendererChangedInfo();
        
        EntityRendererChangedInfoOuterClass.EntityRendererChangedInfo getRendererChangedInfo();
        
        EntityRendererChangedInfoOuterClass.EntityRendererChangedInfoOrBuilder getRendererChangedInfoOrBuilder();
        
        boolean hasAiInfo();
        
        SceneEntityAiInfoOuterClass.SceneEntityAiInfo getAiInfo();
        
        SceneEntityAiInfoOuterClass.SceneEntityAiInfoOrBuilder getAiInfoOrBuilder();
        
        boolean hasBornPos();
        
        VectorOuterClass.Vector getBornPos();
        
        VectorOuterClass.VectorOrBuilder getBornPosOrBuilder();
        
        List<AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair> getPoseParaListList();
        
        AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPair getPoseParaList(final int p0);
        
        int getPoseParaListCount();
        
        List<? extends AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder> getPoseParaListOrBuilderList();
        
        AnimatorParameterValueInfoPairOuterClass.AnimatorParameterValueInfoPairOrBuilder getPoseParaListOrBuilder(final int p0);
    }
}
