// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
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
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class MPLevelEntityInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_MPLevelEntityInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_MPLevelEntityInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private MPLevelEntityInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return MPLevelEntityInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017MPLevelEntityInfo.proto\u001a\u001aAbilitySyncStateInfo.proto\"n\n\u0011MPLevelEntityInfo\u0012+\n\fability_info\u0018\u0001 \u0001(\u000b2\u0015.AbilitySyncStateInfo\u0012\u0011\n\tentity_id\u0018\u000e \u0001(\r\u0012\u0019\n\u0011authority_peer_id\u0018\u000f \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        MPLevelEntityInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AbilitySyncStateInfoOuterClass.getDescriptor() });
        internal_static_MPLevelEntityInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_MPLevelEntityInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(MPLevelEntityInfoOuterClass.internal_static_MPLevelEntityInfo_descriptor, new String[] { "AbilityInfo", "EntityId", "AuthorityPeerId" });
        AbilitySyncStateInfoOuterClass.getDescriptor();
    }
    
    public static final class MPLevelEntityInfo extends GeneratedMessageV3 implements MPLevelEntityInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ABILITY_INFO_FIELD_NUMBER = 1;
        private AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo abilityInfo_;
        public static final int ENTITY_ID_FIELD_NUMBER = 14;
        private int entityId_;
        public static final int AUTHORITY_PEER_ID_FIELD_NUMBER = 15;
        private int authorityPeerId_;
        private byte memoizedIsInitialized;
        private static final MPLevelEntityInfo DEFAULT_INSTANCE;
        private static final Parser<MPLevelEntityInfo> PARSER;
        
        private MPLevelEntityInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private MPLevelEntityInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new MPLevelEntityInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private MPLevelEntityInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
            }
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
                        case 112: {
                            this.entityId_ = input.readUInt32();
                            continue;
                        }
                        case 120: {
                            this.authorityPeerId_ = input.readUInt32();
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
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return MPLevelEntityInfoOuterClass.internal_static_MPLevelEntityInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return MPLevelEntityInfoOuterClass.internal_static_MPLevelEntityInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MPLevelEntityInfo.class, Builder.class);
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
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public int getAuthorityPeerId() {
            return this.authorityPeerId_;
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
            if (this.entityId_ != 0) {
                output.writeUInt32(14, this.entityId_);
            }
            if (this.authorityPeerId_ != 0) {
                output.writeUInt32(15, this.authorityPeerId_);
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
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.entityId_);
            }
            if (this.authorityPeerId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.authorityPeerId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MPLevelEntityInfo)) {
                return super.equals(obj);
            }
            final MPLevelEntityInfo other = (MPLevelEntityInfo)obj;
            return this.hasAbilityInfo() == other.hasAbilityInfo() && (!this.hasAbilityInfo() || this.getAbilityInfo().equals(other.getAbilityInfo())) && this.getEntityId() == other.getEntityId() && this.getAuthorityPeerId() == other.getAuthorityPeerId() && this.unknownFields.equals(other.unknownFields);
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
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getEntityId();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getAuthorityPeerId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static MPLevelEntityInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return MPLevelEntityInfo.PARSER.parseFrom(data);
        }
        
        public static MPLevelEntityInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MPLevelEntityInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MPLevelEntityInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return MPLevelEntityInfo.PARSER.parseFrom(data);
        }
        
        public static MPLevelEntityInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MPLevelEntityInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MPLevelEntityInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return MPLevelEntityInfo.PARSER.parseFrom(data);
        }
        
        public static MPLevelEntityInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return MPLevelEntityInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static MPLevelEntityInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MPLevelEntityInfo.PARSER, input);
        }
        
        public static MPLevelEntityInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MPLevelEntityInfo.PARSER, input, extensionRegistry);
        }
        
        public static MPLevelEntityInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MPLevelEntityInfo.PARSER, input);
        }
        
        public static MPLevelEntityInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(MPLevelEntityInfo.PARSER, input, extensionRegistry);
        }
        
        public static MPLevelEntityInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MPLevelEntityInfo.PARSER, input);
        }
        
        public static MPLevelEntityInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(MPLevelEntityInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return MPLevelEntityInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final MPLevelEntityInfo prototype) {
            return MPLevelEntityInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == MPLevelEntityInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static MPLevelEntityInfo getDefaultInstance() {
            return MPLevelEntityInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<MPLevelEntityInfo> parser() {
            return MPLevelEntityInfo.PARSER;
        }
        
        @Override
        public Parser<MPLevelEntityInfo> getParserForType() {
            return MPLevelEntityInfo.PARSER;
        }
        
        @Override
        public MPLevelEntityInfo getDefaultInstanceForType() {
            return MPLevelEntityInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new MPLevelEntityInfo();
            PARSER = new AbstractParser<MPLevelEntityInfo>() {
                @Override
                public MPLevelEntityInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new MPLevelEntityInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MPLevelEntityInfoOrBuilder
        {
            private AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo abilityInfo_;
            private SingleFieldBuilderV3<AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo.Builder, AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder> abilityInfoBuilder_;
            private int entityId_;
            private int authorityPeerId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return MPLevelEntityInfoOuterClass.internal_static_MPLevelEntityInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return MPLevelEntityInfoOuterClass.internal_static_MPLevelEntityInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(MPLevelEntityInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (MPLevelEntityInfo.alwaysUseFieldBuilders) {}
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
                this.entityId_ = 0;
                this.authorityPeerId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return MPLevelEntityInfoOuterClass.internal_static_MPLevelEntityInfo_descriptor;
            }
            
            @Override
            public MPLevelEntityInfo getDefaultInstanceForType() {
                return MPLevelEntityInfo.getDefaultInstance();
            }
            
            @Override
            public MPLevelEntityInfo build() {
                final MPLevelEntityInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public MPLevelEntityInfo buildPartial() {
                final MPLevelEntityInfo result = new MPLevelEntityInfo(this);
                if (this.abilityInfoBuilder_ == null) {
                    result.abilityInfo_ = this.abilityInfo_;
                }
                else {
                    result.abilityInfo_ = this.abilityInfoBuilder_.build();
                }
                result.entityId_ = this.entityId_;
                result.authorityPeerId_ = this.authorityPeerId_;
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
                if (other instanceof MPLevelEntityInfo) {
                    return this.mergeFrom((MPLevelEntityInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final MPLevelEntityInfo other) {
                if (other == MPLevelEntityInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.hasAbilityInfo()) {
                    this.mergeAbilityInfo(other.getAbilityInfo());
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.getAuthorityPeerId() != 0) {
                    this.setAuthorityPeerId(other.getAuthorityPeerId());
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
                MPLevelEntityInfo parsedMessage = null;
                try {
                    parsedMessage = MPLevelEntityInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (MPLevelEntityInfo)e.getUnfinishedMessage();
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
            public int getEntityId() {
                return this.entityId_;
            }
            
            public Builder setEntityId(final int value) {
                this.entityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEntityId() {
                this.entityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getAuthorityPeerId() {
                return this.authorityPeerId_;
            }
            
            public Builder setAuthorityPeerId(final int value) {
                this.authorityPeerId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearAuthorityPeerId() {
                this.authorityPeerId_ = 0;
                this.onChanged();
                return this;
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
    
    public interface MPLevelEntityInfoOrBuilder extends MessageOrBuilder
    {
        boolean hasAbilityInfo();
        
        AbilitySyncStateInfoOuterClass.AbilitySyncStateInfo getAbilityInfo();
        
        AbilitySyncStateInfoOuterClass.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder();
        
        int getEntityId();
        
        int getAuthorityPeerId();
    }
}
