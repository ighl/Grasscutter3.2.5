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

public final class GadgetGeneralRewardInfoNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_GadgetGeneralRewardInfoNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GadgetGeneralRewardInfoNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GadgetGeneralRewardInfoNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GadgetGeneralRewardInfoNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n#GadgetGeneralRewardInfoNotify.proto\u001a\u001dGadgetGeneralRewardInfo.proto\"i\n\u001dGadgetGeneralRewardInfoNotify\u0012\u0011\n\tentity_id\u0018\r \u0001(\r\u00125\n\u0013general_reward_info\u0018\t \u0001(\u000b2\u0018.GadgetGeneralRewardInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GadgetGeneralRewardInfoNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { GadgetGeneralRewardInfoOuterClass.getDescriptor() });
        internal_static_GadgetGeneralRewardInfoNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GadgetGeneralRewardInfoNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GadgetGeneralRewardInfoNotifyOuterClass.internal_static_GadgetGeneralRewardInfoNotify_descriptor, new String[] { "EntityId", "GeneralRewardInfo" });
        GadgetGeneralRewardInfoOuterClass.getDescriptor();
    }
    
    public static final class GadgetGeneralRewardInfoNotify extends GeneratedMessageV3 implements GadgetGeneralRewardInfoNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ENTITY_ID_FIELD_NUMBER = 13;
        private int entityId_;
        public static final int GENERAL_REWARD_INFO_FIELD_NUMBER = 9;
        private GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo generalRewardInfo_;
        private byte memoizedIsInitialized;
        private static final GadgetGeneralRewardInfoNotify DEFAULT_INSTANCE;
        private static final Parser<GadgetGeneralRewardInfoNotify> PARSER;
        
        private GadgetGeneralRewardInfoNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GadgetGeneralRewardInfoNotify() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GadgetGeneralRewardInfoNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GadgetGeneralRewardInfoNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 74: {
                            GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.Builder subBuilder = null;
                            if (this.generalRewardInfo_ != null) {
                                subBuilder = this.generalRewardInfo_.toBuilder();
                            }
                            this.generalRewardInfo_ = input.readMessage(GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.generalRewardInfo_);
                                this.generalRewardInfo_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 104: {
                            this.entityId_ = input.readUInt32();
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
            return GadgetGeneralRewardInfoNotifyOuterClass.internal_static_GadgetGeneralRewardInfoNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GadgetGeneralRewardInfoNotifyOuterClass.internal_static_GadgetGeneralRewardInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(GadgetGeneralRewardInfoNotify.class, Builder.class);
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
        }
        
        @Override
        public boolean hasGeneralRewardInfo() {
            return this.generalRewardInfo_ != null;
        }
        
        @Override
        public GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo getGeneralRewardInfo() {
            return (this.generalRewardInfo_ == null) ? GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.getDefaultInstance() : this.generalRewardInfo_;
        }
        
        @Override
        public GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfoOrBuilder getGeneralRewardInfoOrBuilder() {
            return this.getGeneralRewardInfo();
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
            if (this.generalRewardInfo_ != null) {
                output.writeMessage(9, this.getGeneralRewardInfo());
            }
            if (this.entityId_ != 0) {
                output.writeUInt32(13, this.entityId_);
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
            if (this.generalRewardInfo_ != null) {
                size += CodedOutputStream.computeMessageSize(9, this.getGeneralRewardInfo());
            }
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(13, this.entityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GadgetGeneralRewardInfoNotify)) {
                return super.equals(obj);
            }
            final GadgetGeneralRewardInfoNotify other = (GadgetGeneralRewardInfoNotify)obj;
            return this.getEntityId() == other.getEntityId() && this.hasGeneralRewardInfo() == other.hasGeneralRewardInfo() && (!this.hasGeneralRewardInfo() || this.getGeneralRewardInfo().equals(other.getGeneralRewardInfo())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getEntityId();
            if (this.hasGeneralRewardInfo()) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getGeneralRewardInfo().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GadgetGeneralRewardInfoNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GadgetGeneralRewardInfoNotify.PARSER.parseFrom(data);
        }
        
        public static GadgetGeneralRewardInfoNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GadgetGeneralRewardInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GadgetGeneralRewardInfoNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GadgetGeneralRewardInfoNotify.PARSER.parseFrom(data);
        }
        
        public static GadgetGeneralRewardInfoNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GadgetGeneralRewardInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GadgetGeneralRewardInfoNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GadgetGeneralRewardInfoNotify.PARSER.parseFrom(data);
        }
        
        public static GadgetGeneralRewardInfoNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GadgetGeneralRewardInfoNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GadgetGeneralRewardInfoNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GadgetGeneralRewardInfoNotify.PARSER, input);
        }
        
        public static GadgetGeneralRewardInfoNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GadgetGeneralRewardInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static GadgetGeneralRewardInfoNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GadgetGeneralRewardInfoNotify.PARSER, input);
        }
        
        public static GadgetGeneralRewardInfoNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GadgetGeneralRewardInfoNotify.PARSER, input, extensionRegistry);
        }
        
        public static GadgetGeneralRewardInfoNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GadgetGeneralRewardInfoNotify.PARSER, input);
        }
        
        public static GadgetGeneralRewardInfoNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GadgetGeneralRewardInfoNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GadgetGeneralRewardInfoNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GadgetGeneralRewardInfoNotify prototype) {
            return GadgetGeneralRewardInfoNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GadgetGeneralRewardInfoNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GadgetGeneralRewardInfoNotify getDefaultInstance() {
            return GadgetGeneralRewardInfoNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<GadgetGeneralRewardInfoNotify> parser() {
            return GadgetGeneralRewardInfoNotify.PARSER;
        }
        
        @Override
        public Parser<GadgetGeneralRewardInfoNotify> getParserForType() {
            return GadgetGeneralRewardInfoNotify.PARSER;
        }
        
        @Override
        public GadgetGeneralRewardInfoNotify getDefaultInstanceForType() {
            return GadgetGeneralRewardInfoNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GadgetGeneralRewardInfoNotify();
            PARSER = new AbstractParser<GadgetGeneralRewardInfoNotify>() {
                @Override
                public GadgetGeneralRewardInfoNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GadgetGeneralRewardInfoNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GadgetGeneralRewardInfoNotifyOrBuilder
        {
            private int entityId_;
            private GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo generalRewardInfo_;
            private SingleFieldBuilderV3<GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo, GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.Builder, GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfoOrBuilder> generalRewardInfoBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GadgetGeneralRewardInfoNotifyOuterClass.internal_static_GadgetGeneralRewardInfoNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GadgetGeneralRewardInfoNotifyOuterClass.internal_static_GadgetGeneralRewardInfoNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(GadgetGeneralRewardInfoNotify.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GadgetGeneralRewardInfoNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.entityId_ = 0;
                if (this.generalRewardInfoBuilder_ == null) {
                    this.generalRewardInfo_ = null;
                }
                else {
                    this.generalRewardInfo_ = null;
                    this.generalRewardInfoBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GadgetGeneralRewardInfoNotifyOuterClass.internal_static_GadgetGeneralRewardInfoNotify_descriptor;
            }
            
            @Override
            public GadgetGeneralRewardInfoNotify getDefaultInstanceForType() {
                return GadgetGeneralRewardInfoNotify.getDefaultInstance();
            }
            
            @Override
            public GadgetGeneralRewardInfoNotify build() {
                final GadgetGeneralRewardInfoNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GadgetGeneralRewardInfoNotify buildPartial() {
                final GadgetGeneralRewardInfoNotify result = new GadgetGeneralRewardInfoNotify(this);
                result.entityId_ = this.entityId_;
                if (this.generalRewardInfoBuilder_ == null) {
                    result.generalRewardInfo_ = this.generalRewardInfo_;
                }
                else {
                    result.generalRewardInfo_ = this.generalRewardInfoBuilder_.build();
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
                if (other instanceof GadgetGeneralRewardInfoNotify) {
                    return this.mergeFrom((GadgetGeneralRewardInfoNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GadgetGeneralRewardInfoNotify other) {
                if (other == GadgetGeneralRewardInfoNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
                }
                if (other.hasGeneralRewardInfo()) {
                    this.mergeGeneralRewardInfo(other.getGeneralRewardInfo());
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
                GadgetGeneralRewardInfoNotify parsedMessage = null;
                try {
                    parsedMessage = GadgetGeneralRewardInfoNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GadgetGeneralRewardInfoNotify)e.getUnfinishedMessage();
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
            public boolean hasGeneralRewardInfo() {
                return this.generalRewardInfoBuilder_ != null || this.generalRewardInfo_ != null;
            }
            
            @Override
            public GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo getGeneralRewardInfo() {
                if (this.generalRewardInfoBuilder_ == null) {
                    return (this.generalRewardInfo_ == null) ? GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.getDefaultInstance() : this.generalRewardInfo_;
                }
                return this.generalRewardInfoBuilder_.getMessage();
            }
            
            public Builder setGeneralRewardInfo(final GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo value) {
                if (this.generalRewardInfoBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.generalRewardInfo_ = value;
                    this.onChanged();
                }
                else {
                    this.generalRewardInfoBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setGeneralRewardInfo(final GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.Builder builderForValue) {
                if (this.generalRewardInfoBuilder_ == null) {
                    this.generalRewardInfo_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.generalRewardInfoBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeGeneralRewardInfo(final GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo value) {
                if (this.generalRewardInfoBuilder_ == null) {
                    if (this.generalRewardInfo_ != null) {
                        this.generalRewardInfo_ = GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.newBuilder(this.generalRewardInfo_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.generalRewardInfo_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.generalRewardInfoBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearGeneralRewardInfo() {
                if (this.generalRewardInfoBuilder_ == null) {
                    this.generalRewardInfo_ = null;
                    this.onChanged();
                }
                else {
                    this.generalRewardInfo_ = null;
                    this.generalRewardInfoBuilder_ = null;
                }
                return this;
            }
            
            public GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.Builder getGeneralRewardInfoBuilder() {
                this.onChanged();
                return this.getGeneralRewardInfoFieldBuilder().getBuilder();
            }
            
            @Override
            public GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfoOrBuilder getGeneralRewardInfoOrBuilder() {
                if (this.generalRewardInfoBuilder_ != null) {
                    return this.generalRewardInfoBuilder_.getMessageOrBuilder();
                }
                return (this.generalRewardInfo_ == null) ? GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.getDefaultInstance() : this.generalRewardInfo_;
            }
            
            private SingleFieldBuilderV3<GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo, GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.Builder, GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfoOrBuilder> getGeneralRewardInfoFieldBuilder() {
                if (this.generalRewardInfoBuilder_ == null) {
                    this.generalRewardInfoBuilder_ = new SingleFieldBuilderV3<GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo, GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo.Builder, GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfoOrBuilder>(this.getGeneralRewardInfo(), this.getParentForChildren(), this.isClean());
                    this.generalRewardInfo_ = null;
                }
                return this.generalRewardInfoBuilder_;
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
    
    public interface GadgetGeneralRewardInfoNotifyOrBuilder extends MessageOrBuilder
    {
        int getEntityId();
        
        boolean hasGeneralRewardInfo();
        
        GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfo getGeneralRewardInfo();
        
        GadgetGeneralRewardInfoOuterClass.GadgetGeneralRewardInfoOrBuilder getGeneralRewardInfoOrBuilder();
    }
}
