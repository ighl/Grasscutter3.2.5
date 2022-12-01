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

public final class GetPlayerBlacklistReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetPlayerBlacklistReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetPlayerBlacklistReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetPlayerBlacklistReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetPlayerBlacklistReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001bGetPlayerBlacklistReq.proto\"\u0017\n\u0015GetPlayerBlacklistReqB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetPlayerBlacklistReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_GetPlayerBlacklistReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetPlayerBlacklistReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetPlayerBlacklistReqOuterClass.internal_static_GetPlayerBlacklistReq_descriptor, new String[0]);
    }
    
    public static final class GetPlayerBlacklistReq extends GeneratedMessageV3 implements GetPlayerBlacklistReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private byte memoizedIsInitialized;
        private static final GetPlayerBlacklistReq DEFAULT_INSTANCE;
        private static final Parser<GetPlayerBlacklistReq> PARSER;
        
        private GetPlayerBlacklistReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GetPlayerBlacklistReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetPlayerBlacklistReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetPlayerBlacklistReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
            return GetPlayerBlacklistReqOuterClass.internal_static_GetPlayerBlacklistReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetPlayerBlacklistReqOuterClass.internal_static_GetPlayerBlacklistReq_fieldAccessorTable.ensureFieldAccessorsInitialized(GetPlayerBlacklistReq.class, Builder.class);
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
            this.unknownFields.writeTo(output);
        }
        
        @Override
        public int getSerializedSize() {
            int size = this.memoizedSize;
            if (size != -1) {
                return size;
            }
            size = 0;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetPlayerBlacklistReq)) {
                return super.equals(obj);
            }
            final GetPlayerBlacklistReq other = (GetPlayerBlacklistReq)obj;
            return this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetPlayerBlacklistReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetPlayerBlacklistReq.PARSER.parseFrom(data);
        }
        
        public static GetPlayerBlacklistReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetPlayerBlacklistReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetPlayerBlacklistReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetPlayerBlacklistReq.PARSER.parseFrom(data);
        }
        
        public static GetPlayerBlacklistReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetPlayerBlacklistReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetPlayerBlacklistReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetPlayerBlacklistReq.PARSER.parseFrom(data);
        }
        
        public static GetPlayerBlacklistReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetPlayerBlacklistReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetPlayerBlacklistReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetPlayerBlacklistReq.PARSER, input);
        }
        
        public static GetPlayerBlacklistReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetPlayerBlacklistReq.PARSER, input, extensionRegistry);
        }
        
        public static GetPlayerBlacklistReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetPlayerBlacklistReq.PARSER, input);
        }
        
        public static GetPlayerBlacklistReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetPlayerBlacklistReq.PARSER, input, extensionRegistry);
        }
        
        public static GetPlayerBlacklistReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetPlayerBlacklistReq.PARSER, input);
        }
        
        public static GetPlayerBlacklistReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetPlayerBlacklistReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetPlayerBlacklistReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetPlayerBlacklistReq prototype) {
            return GetPlayerBlacklistReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetPlayerBlacklistReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetPlayerBlacklistReq getDefaultInstance() {
            return GetPlayerBlacklistReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetPlayerBlacklistReq> parser() {
            return GetPlayerBlacklistReq.PARSER;
        }
        
        @Override
        public Parser<GetPlayerBlacklistReq> getParserForType() {
            return GetPlayerBlacklistReq.PARSER;
        }
        
        @Override
        public GetPlayerBlacklistReq getDefaultInstanceForType() {
            return GetPlayerBlacklistReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetPlayerBlacklistReq();
            PARSER = new AbstractParser<GetPlayerBlacklistReq>() {
                @Override
                public GetPlayerBlacklistReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetPlayerBlacklistReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetPlayerBlacklistReqOrBuilder
        {
            public static final Descriptors.Descriptor getDescriptor() {
                return GetPlayerBlacklistReqOuterClass.internal_static_GetPlayerBlacklistReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetPlayerBlacklistReqOuterClass.internal_static_GetPlayerBlacklistReq_fieldAccessorTable.ensureFieldAccessorsInitialized(GetPlayerBlacklistReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetPlayerBlacklistReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetPlayerBlacklistReqOuterClass.internal_static_GetPlayerBlacklistReq_descriptor;
            }
            
            @Override
            public GetPlayerBlacklistReq getDefaultInstanceForType() {
                return GetPlayerBlacklistReq.getDefaultInstance();
            }
            
            @Override
            public GetPlayerBlacklistReq build() {
                final GetPlayerBlacklistReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetPlayerBlacklistReq buildPartial() {
                final GetPlayerBlacklistReq result = new GetPlayerBlacklistReq(this);
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
                if (other instanceof GetPlayerBlacklistReq) {
                    return this.mergeFrom((GetPlayerBlacklistReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetPlayerBlacklistReq other) {
                if (other == GetPlayerBlacklistReq.getDefaultInstance()) {
                    return this;
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
                GetPlayerBlacklistReq parsedMessage = null;
                try {
                    parsedMessage = GetPlayerBlacklistReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetPlayerBlacklistReq)e.getUnfinishedMessage();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface GetPlayerBlacklistReqOrBuilder extends MessageOrBuilder
    {
    }
}
