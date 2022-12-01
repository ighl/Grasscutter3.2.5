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

public final class EnterSceneDoneReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_EnterSceneDoneReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_EnterSceneDoneReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private EnterSceneDoneReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return EnterSceneDoneReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017EnterSceneDoneReq.proto\".\n\u0011EnterSceneDoneReq\u0012\u0019\n\u0011enter_scene_token\u0018\f \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        EnterSceneDoneReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_EnterSceneDoneReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EnterSceneDoneReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(EnterSceneDoneReqOuterClass.internal_static_EnterSceneDoneReq_descriptor, new String[] { "EnterSceneToken" });
    }
    
    public static final class EnterSceneDoneReq extends GeneratedMessageV3 implements EnterSceneDoneReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ENTER_SCENE_TOKEN_FIELD_NUMBER = 12;
        private int enterSceneToken_;
        private byte memoizedIsInitialized;
        private static final EnterSceneDoneReq DEFAULT_INSTANCE;
        private static final Parser<EnterSceneDoneReq> PARSER;
        
        private EnterSceneDoneReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private EnterSceneDoneReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new EnterSceneDoneReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private EnterSceneDoneReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 96: {
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
            return EnterSceneDoneReqOuterClass.internal_static_EnterSceneDoneReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return EnterSceneDoneReqOuterClass.internal_static_EnterSceneDoneReq_fieldAccessorTable.ensureFieldAccessorsInitialized(EnterSceneDoneReq.class, Builder.class);
        }
        
        @Override
        public int getEnterSceneToken() {
            return this.enterSceneToken_;
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
                output.writeUInt32(12, this.enterSceneToken_);
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
                size += CodedOutputStream.computeUInt32Size(12, this.enterSceneToken_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnterSceneDoneReq)) {
                return super.equals(obj);
            }
            final EnterSceneDoneReq other = (EnterSceneDoneReq)obj;
            return this.getEnterSceneToken() == other.getEnterSceneToken() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getEnterSceneToken();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static EnterSceneDoneReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return EnterSceneDoneReq.PARSER.parseFrom(data);
        }
        
        public static EnterSceneDoneReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EnterSceneDoneReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EnterSceneDoneReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return EnterSceneDoneReq.PARSER.parseFrom(data);
        }
        
        public static EnterSceneDoneReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EnterSceneDoneReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EnterSceneDoneReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return EnterSceneDoneReq.PARSER.parseFrom(data);
        }
        
        public static EnterSceneDoneReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return EnterSceneDoneReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static EnterSceneDoneReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterSceneDoneReq.PARSER, input);
        }
        
        public static EnterSceneDoneReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterSceneDoneReq.PARSER, input, extensionRegistry);
        }
        
        public static EnterSceneDoneReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EnterSceneDoneReq.PARSER, input);
        }
        
        public static EnterSceneDoneReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(EnterSceneDoneReq.PARSER, input, extensionRegistry);
        }
        
        public static EnterSceneDoneReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterSceneDoneReq.PARSER, input);
        }
        
        public static EnterSceneDoneReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(EnterSceneDoneReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return EnterSceneDoneReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final EnterSceneDoneReq prototype) {
            return EnterSceneDoneReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == EnterSceneDoneReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static EnterSceneDoneReq getDefaultInstance() {
            return EnterSceneDoneReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<EnterSceneDoneReq> parser() {
            return EnterSceneDoneReq.PARSER;
        }
        
        @Override
        public Parser<EnterSceneDoneReq> getParserForType() {
            return EnterSceneDoneReq.PARSER;
        }
        
        @Override
        public EnterSceneDoneReq getDefaultInstanceForType() {
            return EnterSceneDoneReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new EnterSceneDoneReq();
            PARSER = new AbstractParser<EnterSceneDoneReq>() {
                @Override
                public EnterSceneDoneReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new EnterSceneDoneReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EnterSceneDoneReqOrBuilder
        {
            private int enterSceneToken_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return EnterSceneDoneReqOuterClass.internal_static_EnterSceneDoneReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return EnterSceneDoneReqOuterClass.internal_static_EnterSceneDoneReq_fieldAccessorTable.ensureFieldAccessorsInitialized(EnterSceneDoneReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (EnterSceneDoneReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.enterSceneToken_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return EnterSceneDoneReqOuterClass.internal_static_EnterSceneDoneReq_descriptor;
            }
            
            @Override
            public EnterSceneDoneReq getDefaultInstanceForType() {
                return EnterSceneDoneReq.getDefaultInstance();
            }
            
            @Override
            public EnterSceneDoneReq build() {
                final EnterSceneDoneReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public EnterSceneDoneReq buildPartial() {
                final EnterSceneDoneReq result = new EnterSceneDoneReq(this);
                result.enterSceneToken_ = this.enterSceneToken_;
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
                if (other instanceof EnterSceneDoneReq) {
                    return this.mergeFrom((EnterSceneDoneReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final EnterSceneDoneReq other) {
                if (other == EnterSceneDoneReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getEnterSceneToken() != 0) {
                    this.setEnterSceneToken(other.getEnterSceneToken());
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
                EnterSceneDoneReq parsedMessage = null;
                try {
                    parsedMessage = EnterSceneDoneReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (EnterSceneDoneReq)e.getUnfinishedMessage();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface EnterSceneDoneReqOrBuilder extends MessageOrBuilder
    {
        int getEnterSceneToken();
    }
}