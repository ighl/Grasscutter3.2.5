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

public final class GetActivityShopSheetInfoReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetActivityShopSheetInfoReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetActivityShopSheetInfoReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetActivityShopSheetInfoReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetActivityShopSheetInfoReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n!GetActivityShopSheetInfoReq.proto\"0\n\u001bGetActivityShopSheetInfoReq\u0012\u0011\n\tshop_type\u0018\u0007 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetActivityShopSheetInfoReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_GetActivityShopSheetInfoReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetActivityShopSheetInfoReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetActivityShopSheetInfoReqOuterClass.internal_static_GetActivityShopSheetInfoReq_descriptor, new String[] { "ShopType" });
    }
    
    public static final class GetActivityShopSheetInfoReq extends GeneratedMessageV3 implements GetActivityShopSheetInfoReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SHOP_TYPE_FIELD_NUMBER = 7;
        private int shopType_;
        private byte memoizedIsInitialized;
        private static final GetActivityShopSheetInfoReq DEFAULT_INSTANCE;
        private static final Parser<GetActivityShopSheetInfoReq> PARSER;
        
        private GetActivityShopSheetInfoReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GetActivityShopSheetInfoReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetActivityShopSheetInfoReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetActivityShopSheetInfoReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 56: {
                            this.shopType_ = input.readUInt32();
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
            return GetActivityShopSheetInfoReqOuterClass.internal_static_GetActivityShopSheetInfoReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetActivityShopSheetInfoReqOuterClass.internal_static_GetActivityShopSheetInfoReq_fieldAccessorTable.ensureFieldAccessorsInitialized(GetActivityShopSheetInfoReq.class, Builder.class);
        }
        
        @Override
        public int getShopType() {
            return this.shopType_;
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
            if (this.shopType_ != 0) {
                output.writeUInt32(7, this.shopType_);
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
            if (this.shopType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.shopType_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetActivityShopSheetInfoReq)) {
                return super.equals(obj);
            }
            final GetActivityShopSheetInfoReq other = (GetActivityShopSheetInfoReq)obj;
            return this.getShopType() == other.getShopType() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getShopType();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetActivityShopSheetInfoReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetActivityShopSheetInfoReq.PARSER.parseFrom(data);
        }
        
        public static GetActivityShopSheetInfoReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetActivityShopSheetInfoReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetActivityShopSheetInfoReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetActivityShopSheetInfoReq.PARSER.parseFrom(data);
        }
        
        public static GetActivityShopSheetInfoReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetActivityShopSheetInfoReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetActivityShopSheetInfoReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetActivityShopSheetInfoReq.PARSER.parseFrom(data);
        }
        
        public static GetActivityShopSheetInfoReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetActivityShopSheetInfoReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetActivityShopSheetInfoReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetActivityShopSheetInfoReq.PARSER, input);
        }
        
        public static GetActivityShopSheetInfoReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetActivityShopSheetInfoReq.PARSER, input, extensionRegistry);
        }
        
        public static GetActivityShopSheetInfoReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetActivityShopSheetInfoReq.PARSER, input);
        }
        
        public static GetActivityShopSheetInfoReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetActivityShopSheetInfoReq.PARSER, input, extensionRegistry);
        }
        
        public static GetActivityShopSheetInfoReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetActivityShopSheetInfoReq.PARSER, input);
        }
        
        public static GetActivityShopSheetInfoReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetActivityShopSheetInfoReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetActivityShopSheetInfoReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetActivityShopSheetInfoReq prototype) {
            return GetActivityShopSheetInfoReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetActivityShopSheetInfoReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetActivityShopSheetInfoReq getDefaultInstance() {
            return GetActivityShopSheetInfoReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetActivityShopSheetInfoReq> parser() {
            return GetActivityShopSheetInfoReq.PARSER;
        }
        
        @Override
        public Parser<GetActivityShopSheetInfoReq> getParserForType() {
            return GetActivityShopSheetInfoReq.PARSER;
        }
        
        @Override
        public GetActivityShopSheetInfoReq getDefaultInstanceForType() {
            return GetActivityShopSheetInfoReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetActivityShopSheetInfoReq();
            PARSER = new AbstractParser<GetActivityShopSheetInfoReq>() {
                @Override
                public GetActivityShopSheetInfoReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetActivityShopSheetInfoReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetActivityShopSheetInfoReqOrBuilder
        {
            private int shopType_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetActivityShopSheetInfoReqOuterClass.internal_static_GetActivityShopSheetInfoReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetActivityShopSheetInfoReqOuterClass.internal_static_GetActivityShopSheetInfoReq_fieldAccessorTable.ensureFieldAccessorsInitialized(GetActivityShopSheetInfoReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetActivityShopSheetInfoReq.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.shopType_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetActivityShopSheetInfoReqOuterClass.internal_static_GetActivityShopSheetInfoReq_descriptor;
            }
            
            @Override
            public GetActivityShopSheetInfoReq getDefaultInstanceForType() {
                return GetActivityShopSheetInfoReq.getDefaultInstance();
            }
            
            @Override
            public GetActivityShopSheetInfoReq build() {
                final GetActivityShopSheetInfoReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetActivityShopSheetInfoReq buildPartial() {
                final GetActivityShopSheetInfoReq result = new GetActivityShopSheetInfoReq(this);
                result.shopType_ = this.shopType_;
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
                if (other instanceof GetActivityShopSheetInfoReq) {
                    return this.mergeFrom((GetActivityShopSheetInfoReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetActivityShopSheetInfoReq other) {
                if (other == GetActivityShopSheetInfoReq.getDefaultInstance()) {
                    return this;
                }
                if (other.getShopType() != 0) {
                    this.setShopType(other.getShopType());
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
                GetActivityShopSheetInfoReq parsedMessage = null;
                try {
                    parsedMessage = GetActivityShopSheetInfoReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetActivityShopSheetInfoReq)e.getUnfinishedMessage();
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
            public int getShopType() {
                return this.shopType_;
            }
            
            public Builder setShopType(final int value) {
                this.shopType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearShopType() {
                this.shopType_ = 0;
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
    
    public interface GetActivityShopSheetInfoReqOrBuilder extends MessageOrBuilder
    {
        int getShopType();
    }
}
