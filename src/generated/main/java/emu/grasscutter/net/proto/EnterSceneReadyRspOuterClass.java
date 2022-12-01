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

public final class EnterSceneReadyRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_EnterSceneReadyRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EnterSceneReadyRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EnterSceneReadyRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EnterSceneReadyRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018EnterSceneReadyRsp.proto\"@\n\u0012EnterSceneReadyRsp\u0012\u0019\n\u0011enter_scene_token\u0018\u000f \u0001(\r\u0012\u000f\n\u0007retcode\u0018\u0004 \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EnterSceneReadyRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_EnterSceneReadyRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EnterSceneReadyRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EnterSceneReadyRspOuterClass.internal_static_EnterSceneReadyRsp_descriptor, new String[] { "EnterSceneToken", "Retcode" });
    }
    
    public static final class EnterSceneReadyRsp extends GeneratedMessageV3 implements EnterSceneReadyRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ENTER_SCENE_TOKEN_FIELD_NUMBER = 15;
        private int enterSceneToken_;
        public static final int RETCODE_FIELD_NUMBER = 4;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final EnterSceneReadyRsp DEFAULT_INSTANCE;
        private static final Parser<EnterSceneReadyRsp> PARSER;
        
        private EnterSceneReadyRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EnterSceneReadyRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EnterSceneReadyRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EnterSceneReadyRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 120: {
                            this.enterSceneToken_ = input.readUInt32();
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
            return EnterSceneReadyRspOuterClass.internal_static_EnterSceneReadyRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EnterSceneReadyRspOuterClass.internal_static_EnterSceneReadyRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(EnterSceneReadyRsp.class, Builder.class);
        }
        
        @Override
        public int getEnterSceneToken() {
            return this.enterSceneToken_;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
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
                output.writeInt32(4, this.retcode_);
            }
            if (this.enterSceneToken_ != 0) {
                output.writeUInt32(15, this.enterSceneToken_);
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
                size += CodedOutputStream.computeInt32Size(4, this.retcode_);
            }
            if (this.enterSceneToken_ != 0) {
                size += CodedOutputStream.computeUInt32Size(15, this.enterSceneToken_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnterSceneReadyRsp)) {
                return super.equals(obj);
            }
            final EnterSceneReadyRsp other = (EnterSceneReadyRsp)obj;
            return this.getEnterSceneToken() == other.getEnterSceneToken() && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 15;
            hash = 53 * hash + this.getEnterSceneToken();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EnterSceneReadyRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EnterSceneReadyRsp.PARSER.parseFrom(data);
        }
        
        public static EnterSceneReadyRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EnterSceneReadyRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EnterSceneReadyRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EnterSceneReadyRsp.PARSER.parseFrom(data);
        }
        
        public static EnterSceneReadyRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EnterSceneReadyRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EnterSceneReadyRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EnterSceneReadyRsp.PARSER.parseFrom(data);
        }
        
        public static EnterSceneReadyRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EnterSceneReadyRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EnterSceneReadyRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterSceneReadyRsp.PARSER, input);
        }
        
        public static EnterSceneReadyRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterSceneReadyRsp.PARSER, input, extensionRegistry);
        }
        
        public static EnterSceneReadyRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EnterSceneReadyRsp.PARSER, input);
        }
        
        public static EnterSceneReadyRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EnterSceneReadyRsp.PARSER, input, extensionRegistry);
        }
        
        public static EnterSceneReadyRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterSceneReadyRsp.PARSER, input);
        }
        
        public static EnterSceneReadyRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterSceneReadyRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EnterSceneReadyRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EnterSceneReadyRsp prototype) {
            return EnterSceneReadyRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EnterSceneReadyRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EnterSceneReadyRsp getDefaultInstance() {
            return EnterSceneReadyRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<EnterSceneReadyRsp> parser() {
            return EnterSceneReadyRsp.PARSER;
        }
        
        @Override
        public Parser<EnterSceneReadyRsp> getParserForType() {
            return EnterSceneReadyRsp.PARSER;
        }
        
        @Override
        public EnterSceneReadyRsp getDefaultInstanceForType() {
            return EnterSceneReadyRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EnterSceneReadyRsp();
            PARSER = new AbstractParser<EnterSceneReadyRsp>() {
                @Override
                public EnterSceneReadyRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EnterSceneReadyRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EnterSceneReadyRspOrBuilder
        {
            private int enterSceneToken_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EnterSceneReadyRspOuterClass.internal_static_EnterSceneReadyRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EnterSceneReadyRspOuterClass.internal_static_EnterSceneReadyRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(EnterSceneReadyRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EnterSceneReadyRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.enterSceneToken_ = 0;
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EnterSceneReadyRspOuterClass.internal_static_EnterSceneReadyRsp_descriptor;
            }
            
            @Override
            public EnterSceneReadyRsp getDefaultInstanceForType() {
                return EnterSceneReadyRsp.getDefaultInstance();
            }
            
            @Override
            public EnterSceneReadyRsp build() {
                final EnterSceneReadyRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EnterSceneReadyRsp buildPartial() {
                final EnterSceneReadyRsp result = new EnterSceneReadyRsp(this);
                result.enterSceneToken_ = this.enterSceneToken_;
                result.retcode_ = this.retcode_;
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
                if (other instanceof EnterSceneReadyRsp) {
                    return this.mergeFrom((EnterSceneReadyRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EnterSceneReadyRsp other) {
                if (other == EnterSceneReadyRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getEnterSceneToken() != 0) {
                    this.setEnterSceneToken(other.getEnterSceneToken());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
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
                EnterSceneReadyRsp parsedMessage = null;
                try {
                    parsedMessage = EnterSceneReadyRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EnterSceneReadyRsp)e.getUnfinishedMessage();
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
            public int getEnterSceneToken() {
                return this.enterSceneToken_;
            }
            
            public Builder setEnterSceneToken(final int value) {
                this.enterSceneToken_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearEnterSceneToken() {
                this.enterSceneToken_ = 0;
                this.onChanged();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface EnterSceneReadyRspOrBuilder extends MessageOrBuilder
    {
        int getEnterSceneToken();
        
        int getRetcode();
    }
}
