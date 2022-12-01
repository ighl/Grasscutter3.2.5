// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collections;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.util.List;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class GetShopmallDataRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetShopmallDataRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetShopmallDataRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetShopmallDataRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetShopmallDataRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018GetShopmallDataRsp.proto\"=\n\u0012GetShopmallDataRsp\u0012\u0016\n\u000eshop_type_list\u0018\u000f \u0003(\r\u0012\u000f\n\u0007retcode\u0018\u0003 \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetShopmallDataRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_GetShopmallDataRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetShopmallDataRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetShopmallDataRspOuterClass.internal_static_GetShopmallDataRsp_descriptor, new String[] { "ShopTypeList", "Retcode" });
    }
    
    public static final class GetShopmallDataRsp extends GeneratedMessageV3 implements GetShopmallDataRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int SHOP_TYPE_LIST_FIELD_NUMBER = 15;
        private Internal.IntList shopTypeList_;
        private int shopTypeListMemoizedSerializedSize;
        public static final int RETCODE_FIELD_NUMBER = 3;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final GetShopmallDataRsp DEFAULT_INSTANCE;
        private static final Parser<GetShopmallDataRsp> PARSER;
        
        private GetShopmallDataRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.shopTypeListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private GetShopmallDataRsp() {
            this.shopTypeListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.shopTypeList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetShopmallDataRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetShopmallDataRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 24: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 120: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.shopTypeList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.shopTypeList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 122: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.shopTypeList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.shopTypeList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
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
                    this.shopTypeList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GetShopmallDataRspOuterClass.internal_static_GetShopmallDataRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetShopmallDataRspOuterClass.internal_static_GetShopmallDataRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetShopmallDataRsp.class, Builder.class);
        }
        
        @Override
        public List<Integer> getShopTypeListList() {
            return this.shopTypeList_;
        }
        
        @Override
        public int getShopTypeListCount() {
            return this.shopTypeList_.size();
        }
        
        @Override
        public int getShopTypeList(final int index) {
            return this.shopTypeList_.getInt(index);
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
            this.getSerializedSize();
            if (this.retcode_ != 0) {
                output.writeInt32(3, this.retcode_);
            }
            if (this.getShopTypeListList().size() > 0) {
                output.writeUInt32NoTag(122);
                output.writeUInt32NoTag(this.shopTypeListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.shopTypeList_.size(); ++i) {
                output.writeUInt32NoTag(this.shopTypeList_.getInt(i));
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
                size += CodedOutputStream.computeInt32Size(3, this.retcode_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.shopTypeList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.shopTypeList_.getInt(i));
            }
            size += dataSize;
            if (!this.getShopTypeListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.shopTypeListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetShopmallDataRsp)) {
                return super.equals(obj);
            }
            final GetShopmallDataRsp other = (GetShopmallDataRsp)obj;
            return this.getShopTypeListList().equals(other.getShopTypeListList()) && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getShopTypeListCount() > 0) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getShopTypeListList().hashCode();
            }
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetShopmallDataRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetShopmallDataRsp.PARSER.parseFrom(data);
        }
        
        public static GetShopmallDataRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetShopmallDataRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetShopmallDataRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetShopmallDataRsp.PARSER.parseFrom(data);
        }
        
        public static GetShopmallDataRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetShopmallDataRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetShopmallDataRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetShopmallDataRsp.PARSER.parseFrom(data);
        }
        
        public static GetShopmallDataRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetShopmallDataRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetShopmallDataRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetShopmallDataRsp.PARSER, input);
        }
        
        public static GetShopmallDataRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetShopmallDataRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetShopmallDataRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetShopmallDataRsp.PARSER, input);
        }
        
        public static GetShopmallDataRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetShopmallDataRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetShopmallDataRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetShopmallDataRsp.PARSER, input);
        }
        
        public static GetShopmallDataRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetShopmallDataRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetShopmallDataRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetShopmallDataRsp prototype) {
            return GetShopmallDataRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetShopmallDataRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetShopmallDataRsp getDefaultInstance() {
            return GetShopmallDataRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetShopmallDataRsp> parser() {
            return GetShopmallDataRsp.PARSER;
        }
        
        @Override
        public Parser<GetShopmallDataRsp> getParserForType() {
            return GetShopmallDataRsp.PARSER;
        }
        
        @Override
        public GetShopmallDataRsp getDefaultInstanceForType() {
            return GetShopmallDataRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetShopmallDataRsp();
            PARSER = new AbstractParser<GetShopmallDataRsp>() {
                @Override
                public GetShopmallDataRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetShopmallDataRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetShopmallDataRspOrBuilder
        {
            private int bitField0_;
            private Internal.IntList shopTypeList_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetShopmallDataRspOuterClass.internal_static_GetShopmallDataRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetShopmallDataRspOuterClass.internal_static_GetShopmallDataRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetShopmallDataRsp.class, Builder.class);
            }
            
            private Builder() {
                this.shopTypeList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.shopTypeList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetShopmallDataRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.shopTypeList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetShopmallDataRspOuterClass.internal_static_GetShopmallDataRsp_descriptor;
            }
            
            @Override
            public GetShopmallDataRsp getDefaultInstanceForType() {
                return GetShopmallDataRsp.getDefaultInstance();
            }
            
            @Override
            public GetShopmallDataRsp build() {
                final GetShopmallDataRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetShopmallDataRsp buildPartial() {
                final GetShopmallDataRsp result = new GetShopmallDataRsp(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.shopTypeList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.shopTypeList_ = this.shopTypeList_;
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
                if (other instanceof GetShopmallDataRsp) {
                    return this.mergeFrom((GetShopmallDataRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetShopmallDataRsp other) {
                if (other == GetShopmallDataRsp.getDefaultInstance()) {
                    return this;
                }
                if (!other.shopTypeList_.isEmpty()) {
                    if (this.shopTypeList_.isEmpty()) {
                        this.shopTypeList_ = other.shopTypeList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureShopTypeListIsMutable();
                        this.shopTypeList_.addAll(other.shopTypeList_);
                    }
                    this.onChanged();
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
                GetShopmallDataRsp parsedMessage = null;
                try {
                    parsedMessage = GetShopmallDataRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetShopmallDataRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureShopTypeListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.shopTypeList_ = GeneratedMessageV3.mutableCopy(this.shopTypeList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getShopTypeListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.shopTypeList_) : this.shopTypeList_;
            }
            
            @Override
            public int getShopTypeListCount() {
                return this.shopTypeList_.size();
            }
            
            @Override
            public int getShopTypeList(final int index) {
                return this.shopTypeList_.getInt(index);
            }
            
            public Builder setShopTypeList(final int index, final int value) {
                this.ensureShopTypeListIsMutable();
                this.shopTypeList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addShopTypeList(final int value) {
                this.ensureShopTypeListIsMutable();
                this.shopTypeList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllShopTypeList(final Iterable<? extends Integer> values) {
                this.ensureShopTypeListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.shopTypeList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearShopTypeList() {
                this.shopTypeList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
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
    
    public interface GetShopmallDataRspOrBuilder extends MessageOrBuilder
    {
        List<Integer> getShopTypeListList();
        
        int getShopTypeListCount();
        
        int getShopTypeList(final int p0);
        
        int getRetcode();
    }
}
