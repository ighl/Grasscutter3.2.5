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

public final class DestroyMaterialRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_DestroyMaterialRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_DestroyMaterialRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private DestroyMaterialRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return DestroyMaterialRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0018DestroyMaterialRsp.proto\"T\n\u0012DestroyMaterialRsp\u0012\u0017\n\u000fitem_count_list\u0018\f \u0003(\r\u0012\u0014\n\fitem_id_list\u0018\r \u0003(\r\u0012\u000f\n\u0007retcode\u0018\u000b \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        DestroyMaterialRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_DestroyMaterialRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_DestroyMaterialRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(DestroyMaterialRspOuterClass.internal_static_DestroyMaterialRsp_descriptor, new String[] { "ItemCountList", "ItemIdList", "Retcode" });
    }
    
    public static final class DestroyMaterialRsp extends GeneratedMessageV3 implements DestroyMaterialRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ITEM_COUNT_LIST_FIELD_NUMBER = 12;
        private Internal.IntList itemCountList_;
        private int itemCountListMemoizedSerializedSize;
        public static final int ITEM_ID_LIST_FIELD_NUMBER = 13;
        private Internal.IntList itemIdList_;
        private int itemIdListMemoizedSerializedSize;
        public static final int RETCODE_FIELD_NUMBER = 11;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final DestroyMaterialRsp DEFAULT_INSTANCE;
        private static final Parser<DestroyMaterialRsp> PARSER;
        
        private DestroyMaterialRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.itemCountListMemoizedSerializedSize = -1;
            this.itemIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private DestroyMaterialRsp() {
            this.itemCountListMemoizedSerializedSize = -1;
            this.itemIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.itemCountList_ = GeneratedMessageV3.emptyIntList();
            this.itemIdList_ = GeneratedMessageV3.emptyIntList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new DestroyMaterialRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private DestroyMaterialRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 88: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 96: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.itemCountList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.itemCountList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 98: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.itemCountList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.itemCountList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 104: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.itemIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.itemIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 106: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x2) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.itemIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x2;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.itemIdList_.addInt(input.readUInt32());
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
                    this.itemCountList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.itemIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return DestroyMaterialRspOuterClass.internal_static_DestroyMaterialRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return DestroyMaterialRspOuterClass.internal_static_DestroyMaterialRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(DestroyMaterialRsp.class, Builder.class);
        }
        
        @Override
        public List<Integer> getItemCountListList() {
            return this.itemCountList_;
        }
        
        @Override
        public int getItemCountListCount() {
            return this.itemCountList_.size();
        }
        
        @Override
        public int getItemCountList(final int index) {
            return this.itemCountList_.getInt(index);
        }
        
        @Override
        public List<Integer> getItemIdListList() {
            return this.itemIdList_;
        }
        
        @Override
        public int getItemIdListCount() {
            return this.itemIdList_.size();
        }
        
        @Override
        public int getItemIdList(final int index) {
            return this.itemIdList_.getInt(index);
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
                output.writeInt32(11, this.retcode_);
            }
            if (this.getItemCountListList().size() > 0) {
                output.writeUInt32NoTag(98);
                output.writeUInt32NoTag(this.itemCountListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.itemCountList_.size(); ++i) {
                output.writeUInt32NoTag(this.itemCountList_.getInt(i));
            }
            if (this.getItemIdListList().size() > 0) {
                output.writeUInt32NoTag(106);
                output.writeUInt32NoTag(this.itemIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.itemIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.itemIdList_.getInt(i));
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
                size += CodedOutputStream.computeInt32Size(11, this.retcode_);
            }
            int dataSize = 0;
            for (int i = 0; i < this.itemCountList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.itemCountList_.getInt(i));
            }
            size += dataSize;
            if (!this.getItemCountListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.itemCountListMemoizedSerializedSize = dataSize;
            dataSize = 0;
            for (int i = 0; i < this.itemIdList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.itemIdList_.getInt(i));
            }
            size += dataSize;
            if (!this.getItemIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.itemIdListMemoizedSerializedSize = dataSize;
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DestroyMaterialRsp)) {
                return super.equals(obj);
            }
            final DestroyMaterialRsp other = (DestroyMaterialRsp)obj;
            return this.getItemCountListList().equals(other.getItemCountListList()) && this.getItemIdListList().equals(other.getItemIdListList()) && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getItemCountListCount() > 0) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getItemCountListList().hashCode();
            }
            if (this.getItemIdListCount() > 0) {
                hash = 37 * hash + 13;
                hash = 53 * hash + this.getItemIdListList().hashCode();
            }
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static DestroyMaterialRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return DestroyMaterialRsp.PARSER.parseFrom(data);
        }
        
        public static DestroyMaterialRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DestroyMaterialRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DestroyMaterialRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return DestroyMaterialRsp.PARSER.parseFrom(data);
        }
        
        public static DestroyMaterialRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DestroyMaterialRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DestroyMaterialRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return DestroyMaterialRsp.PARSER.parseFrom(data);
        }
        
        public static DestroyMaterialRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return DestroyMaterialRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static DestroyMaterialRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DestroyMaterialRsp.PARSER, input);
        }
        
        public static DestroyMaterialRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DestroyMaterialRsp.PARSER, input, extensionRegistry);
        }
        
        public static DestroyMaterialRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DestroyMaterialRsp.PARSER, input);
        }
        
        public static DestroyMaterialRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(DestroyMaterialRsp.PARSER, input, extensionRegistry);
        }
        
        public static DestroyMaterialRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DestroyMaterialRsp.PARSER, input);
        }
        
        public static DestroyMaterialRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(DestroyMaterialRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return DestroyMaterialRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final DestroyMaterialRsp prototype) {
            return DestroyMaterialRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == DestroyMaterialRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static DestroyMaterialRsp getDefaultInstance() {
            return DestroyMaterialRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<DestroyMaterialRsp> parser() {
            return DestroyMaterialRsp.PARSER;
        }
        
        @Override
        public Parser<DestroyMaterialRsp> getParserForType() {
            return DestroyMaterialRsp.PARSER;
        }
        
        @Override
        public DestroyMaterialRsp getDefaultInstanceForType() {
            return DestroyMaterialRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new DestroyMaterialRsp();
            PARSER = new AbstractParser<DestroyMaterialRsp>() {
                @Override
                public DestroyMaterialRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new DestroyMaterialRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DestroyMaterialRspOrBuilder
        {
            private int bitField0_;
            private Internal.IntList itemCountList_;
            private Internal.IntList itemIdList_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return DestroyMaterialRspOuterClass.internal_static_DestroyMaterialRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return DestroyMaterialRspOuterClass.internal_static_DestroyMaterialRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(DestroyMaterialRsp.class, Builder.class);
            }
            
            private Builder() {
                this.itemCountList_ = GeneratedMessageV3.emptyIntList();
                this.itemIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.itemCountList_ = GeneratedMessageV3.emptyIntList();
                this.itemIdList_ = GeneratedMessageV3.emptyIntList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (DestroyMaterialRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.itemCountList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.itemIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return DestroyMaterialRspOuterClass.internal_static_DestroyMaterialRsp_descriptor;
            }
            
            @Override
            public DestroyMaterialRsp getDefaultInstanceForType() {
                return DestroyMaterialRsp.getDefaultInstance();
            }
            
            @Override
            public DestroyMaterialRsp build() {
                final DestroyMaterialRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public DestroyMaterialRsp buildPartial() {
                final DestroyMaterialRsp result = new DestroyMaterialRsp(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.itemCountList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.itemCountList_ = this.itemCountList_;
                if ((this.bitField0_ & 0x2) != 0x0) {
                    this.itemIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                result.itemIdList_ = this.itemIdList_;
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
                if (other instanceof DestroyMaterialRsp) {
                    return this.mergeFrom((DestroyMaterialRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final DestroyMaterialRsp other) {
                if (other == DestroyMaterialRsp.getDefaultInstance()) {
                    return this;
                }
                if (!other.itemCountList_.isEmpty()) {
                    if (this.itemCountList_.isEmpty()) {
                        this.itemCountList_ = other.itemCountList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureItemCountListIsMutable();
                        this.itemCountList_.addAll(other.itemCountList_);
                    }
                    this.onChanged();
                }
                if (!other.itemIdList_.isEmpty()) {
                    if (this.itemIdList_.isEmpty()) {
                        this.itemIdList_ = other.itemIdList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    else {
                        this.ensureItemIdListIsMutable();
                        this.itemIdList_.addAll(other.itemIdList_);
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
                DestroyMaterialRsp parsedMessage = null;
                try {
                    parsedMessage = DestroyMaterialRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (DestroyMaterialRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureItemCountListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.itemCountList_ = GeneratedMessageV3.mutableCopy(this.itemCountList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getItemCountListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.itemCountList_) : this.itemCountList_;
            }
            
            @Override
            public int getItemCountListCount() {
                return this.itemCountList_.size();
            }
            
            @Override
            public int getItemCountList(final int index) {
                return this.itemCountList_.getInt(index);
            }
            
            public Builder setItemCountList(final int index, final int value) {
                this.ensureItemCountListIsMutable();
                this.itemCountList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addItemCountList(final int value) {
                this.ensureItemCountListIsMutable();
                this.itemCountList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllItemCountList(final Iterable<? extends Integer> values) {
                this.ensureItemCountListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.itemCountList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearItemCountList() {
                this.itemCountList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private void ensureItemIdListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.itemIdList_ = GeneratedMessageV3.mutableCopy(this.itemIdList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<Integer> getItemIdListList() {
                return ((this.bitField0_ & 0x2) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.itemIdList_) : this.itemIdList_;
            }
            
            @Override
            public int getItemIdListCount() {
                return this.itemIdList_.size();
            }
            
            @Override
            public int getItemIdList(final int index) {
                return this.itemIdList_.getInt(index);
            }
            
            public Builder setItemIdList(final int index, final int value) {
                this.ensureItemIdListIsMutable();
                this.itemIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addItemIdList(final int value) {
                this.ensureItemIdListIsMutable();
                this.itemIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllItemIdList(final Iterable<? extends Integer> values) {
                this.ensureItemIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.itemIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearItemIdList() {
                this.itemIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFD;
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
    
    public interface DestroyMaterialRspOrBuilder extends MessageOrBuilder
    {
        List<Integer> getItemCountListList();
        
        int getItemCountListCount();
        
        int getItemCountList(final int p0);
        
        List<Integer> getItemIdListList();
        
        int getItemIdListCount();
        
        int getItemIdList(final int p0);
        
        int getRetcode();
    }
}
