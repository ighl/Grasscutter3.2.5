// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
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

public final class SceneEntityDrownRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_SceneEntityDrownRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneEntityDrownRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SceneEntityDrownRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SceneEntityDrownRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0019SceneEntityDrownRsp.proto\"9\n\u0013SceneEntityDrownRsp\u0012\u000f\n\u0007retcode\u0018\b \u0001(\u0005\u0012\u0011\n\tentity_id\u0018\u000b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SceneEntityDrownRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_SceneEntityDrownRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SceneEntityDrownRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneEntityDrownRspOuterClass.internal_static_SceneEntityDrownRsp_descriptor, new String[] { "Retcode", "EntityId" });
    }
    
    public static final class SceneEntityDrownRsp extends GeneratedMessageV3 implements SceneEntityDrownRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 8;
        private int retcode_;
        public static final int ENTITY_ID_FIELD_NUMBER = 11;
        private int entityId_;
        private byte memoizedIsInitialized;
        private static final SceneEntityDrownRsp DEFAULT_INSTANCE;
        private static final Parser<SceneEntityDrownRsp> PARSER;
        
        private SceneEntityDrownRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SceneEntityDrownRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SceneEntityDrownRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SceneEntityDrownRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 64: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 88: {
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
            return SceneEntityDrownRspOuterClass.internal_static_SceneEntityDrownRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SceneEntityDrownRspOuterClass.internal_static_SceneEntityDrownRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneEntityDrownRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getEntityId() {
            return this.entityId_;
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
            if (this.retcode_ != 0) {
                output.writeInt32(8, this.retcode_);
            }
            if (this.entityId_ != 0) {
                output.writeUInt32(11, this.entityId_);
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
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(8, this.retcode_);
            }
            if (this.entityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.entityId_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneEntityDrownRsp)) {
                return super.equals(obj);
            }
            final SceneEntityDrownRsp other = (SceneEntityDrownRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getEntityId() == other.getEntityId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getEntityId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SceneEntityDrownRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SceneEntityDrownRsp.PARSER.parseFrom(data);
        }
        
        public static SceneEntityDrownRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneEntityDrownRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneEntityDrownRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SceneEntityDrownRsp.PARSER.parseFrom(data);
        }
        
        public static SceneEntityDrownRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneEntityDrownRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneEntityDrownRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SceneEntityDrownRsp.PARSER.parseFrom(data);
        }
        
        public static SceneEntityDrownRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneEntityDrownRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneEntityDrownRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneEntityDrownRsp.PARSER, input);
        }
        
        public static SceneEntityDrownRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneEntityDrownRsp.PARSER, input, extensionRegistry);
        }
        
        public static SceneEntityDrownRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneEntityDrownRsp.PARSER, input);
        }
        
        public static SceneEntityDrownRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneEntityDrownRsp.PARSER, input, extensionRegistry);
        }
        
        public static SceneEntityDrownRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneEntityDrownRsp.PARSER, input);
        }
        
        public static SceneEntityDrownRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneEntityDrownRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SceneEntityDrownRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SceneEntityDrownRsp prototype) {
            return SceneEntityDrownRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SceneEntityDrownRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SceneEntityDrownRsp getDefaultInstance() {
            return SceneEntityDrownRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<SceneEntityDrownRsp> parser() {
            return SceneEntityDrownRsp.PARSER;
        }
        
        @Override
        public Parser<SceneEntityDrownRsp> getParserForType() {
            return SceneEntityDrownRsp.PARSER;
        }
        
        @Override
        public SceneEntityDrownRsp getDefaultInstanceForType() {
            return SceneEntityDrownRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SceneEntityDrownRsp();
            PARSER = new AbstractParser<SceneEntityDrownRsp>() {
                @Override
                public SceneEntityDrownRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SceneEntityDrownRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SceneEntityDrownRspOrBuilder
        {
            private int retcode_;
            private int entityId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SceneEntityDrownRspOuterClass.internal_static_SceneEntityDrownRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SceneEntityDrownRspOuterClass.internal_static_SceneEntityDrownRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneEntityDrownRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SceneEntityDrownRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.entityId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SceneEntityDrownRspOuterClass.internal_static_SceneEntityDrownRsp_descriptor;
            }
            
            @Override
            public SceneEntityDrownRsp getDefaultInstanceForType() {
                return SceneEntityDrownRsp.getDefaultInstance();
            }
            
            @Override
            public SceneEntityDrownRsp build() {
                final SceneEntityDrownRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SceneEntityDrownRsp buildPartial() {
                final SceneEntityDrownRsp result = new SceneEntityDrownRsp(this);
                result.retcode_ = this.retcode_;
                result.entityId_ = this.entityId_;
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
                if (other instanceof SceneEntityDrownRsp) {
                    return this.mergeFrom((SceneEntityDrownRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SceneEntityDrownRsp other) {
                if (other == SceneEntityDrownRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getEntityId() != 0) {
                    this.setEntityId(other.getEntityId());
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
                SceneEntityDrownRsp parsedMessage = null;
                try {
                    parsedMessage = SceneEntityDrownRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SceneEntityDrownRsp)e.getUnfinishedMessage();
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
            public int getRetcode() {
                return this.retcode_;
            }
            
            public Builder setRetcode(final int value) {
                this.retcode_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearRetcode() {
                this.retcode_ = 0;
                this.onChanged();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface SceneEntityDrownRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        int getEntityId();
    }
}
