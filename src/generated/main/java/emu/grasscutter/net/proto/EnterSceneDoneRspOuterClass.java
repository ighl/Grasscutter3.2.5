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

public final class EnterSceneDoneRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_EnterSceneDoneRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EnterSceneDoneRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EnterSceneDoneRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EnterSceneDoneRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017EnterSceneDoneRsp.proto\"?\n\u0011EnterSceneDoneRsp\u0012\u0019\n\u0011enter_scene_token\u0018\u0002 \u0001(\r\u0012\u000f\n\u0007retcode\u0018\r \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EnterSceneDoneRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_EnterSceneDoneRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EnterSceneDoneRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EnterSceneDoneRspOuterClass.internal_static_EnterSceneDoneRsp_descriptor, new String[] { "EnterSceneToken", "Retcode" });
    }
    
    public static final class EnterSceneDoneRsp extends GeneratedMessageV3 implements EnterSceneDoneRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ENTER_SCENE_TOKEN_FIELD_NUMBER = 2;
        private int enterSceneToken_;
        public static final int RETCODE_FIELD_NUMBER = 13;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final EnterSceneDoneRsp DEFAULT_INSTANCE;
        private static final Parser<EnterSceneDoneRsp> PARSER;
        
        private EnterSceneDoneRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EnterSceneDoneRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EnterSceneDoneRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EnterSceneDoneRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.enterSceneToken_ = input.readUInt32();
                            continue;
                        }
                        case 104: {
                            this.retcode_ = input.readInt32();
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
            return EnterSceneDoneRspOuterClass.internal_static_EnterSceneDoneRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EnterSceneDoneRspOuterClass.internal_static_EnterSceneDoneRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(EnterSceneDoneRsp.class, Builder.class);
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
            if (this.enterSceneToken_ != 0) {
                output.writeUInt32(2, this.enterSceneToken_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(13, this.retcode_);
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
            if (this.enterSceneToken_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.enterSceneToken_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(13, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnterSceneDoneRsp)) {
                return super.equals(obj);
            }
            final EnterSceneDoneRsp other = (EnterSceneDoneRsp)obj;
            return this.getEnterSceneToken() == other.getEnterSceneToken() && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getEnterSceneToken();
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EnterSceneDoneRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EnterSceneDoneRsp.PARSER.parseFrom(data);
        }
        
        public static EnterSceneDoneRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EnterSceneDoneRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EnterSceneDoneRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EnterSceneDoneRsp.PARSER.parseFrom(data);
        }
        
        public static EnterSceneDoneRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EnterSceneDoneRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EnterSceneDoneRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EnterSceneDoneRsp.PARSER.parseFrom(data);
        }
        
        public static EnterSceneDoneRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EnterSceneDoneRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EnterSceneDoneRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterSceneDoneRsp.PARSER, input);
        }
        
        public static EnterSceneDoneRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterSceneDoneRsp.PARSER, input, extensionRegistry);
        }
        
        public static EnterSceneDoneRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EnterSceneDoneRsp.PARSER, input);
        }
        
        public static EnterSceneDoneRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EnterSceneDoneRsp.PARSER, input, extensionRegistry);
        }
        
        public static EnterSceneDoneRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterSceneDoneRsp.PARSER, input);
        }
        
        public static EnterSceneDoneRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterSceneDoneRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EnterSceneDoneRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EnterSceneDoneRsp prototype) {
            return EnterSceneDoneRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EnterSceneDoneRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EnterSceneDoneRsp getDefaultInstance() {
            return EnterSceneDoneRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<EnterSceneDoneRsp> parser() {
            return EnterSceneDoneRsp.PARSER;
        }
        
        @Override
        public Parser<EnterSceneDoneRsp> getParserForType() {
            return EnterSceneDoneRsp.PARSER;
        }
        
        @Override
        public EnterSceneDoneRsp getDefaultInstanceForType() {
            return EnterSceneDoneRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EnterSceneDoneRsp();
            PARSER = new AbstractParser<EnterSceneDoneRsp>() {
                @Override
                public EnterSceneDoneRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EnterSceneDoneRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EnterSceneDoneRspOrBuilder
        {
            private int enterSceneToken_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EnterSceneDoneRspOuterClass.internal_static_EnterSceneDoneRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EnterSceneDoneRspOuterClass.internal_static_EnterSceneDoneRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(EnterSceneDoneRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EnterSceneDoneRsp.alwaysUseFieldBuilders) {}
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
                return EnterSceneDoneRspOuterClass.internal_static_EnterSceneDoneRsp_descriptor;
            }
            
            @Override
            public EnterSceneDoneRsp getDefaultInstanceForType() {
                return EnterSceneDoneRsp.getDefaultInstance();
            }
            
            @Override
            public EnterSceneDoneRsp build() {
                final EnterSceneDoneRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EnterSceneDoneRsp buildPartial() {
                final EnterSceneDoneRsp result = new EnterSceneDoneRsp(this);
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
                if (other instanceof EnterSceneDoneRsp) {
                    return this.mergeFrom((EnterSceneDoneRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EnterSceneDoneRsp other) {
                if (other == EnterSceneDoneRsp.getDefaultInstance()) {
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
                EnterSceneDoneRsp parsedMessage = null;
                try {
                    parsedMessage = EnterSceneDoneRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EnterSceneDoneRsp)e.getUnfinishedMessage();
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
    
    public interface EnterSceneDoneRspOrBuilder extends MessageOrBuilder
    {
        int getEnterSceneToken();
        
        int getRetcode();
    }
}
