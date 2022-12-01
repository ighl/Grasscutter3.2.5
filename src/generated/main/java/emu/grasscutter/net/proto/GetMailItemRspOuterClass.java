// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import java.util.Collections;
import com.google.protobuf.Parser;
import java.util.List;
import com.google.protobuf.Internal;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class GetMailItemRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetMailItemRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetMailItemRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetMailItemRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetMailItemRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0014GetMailItemRsp.proto\u001a\u0010EquipParam.proto\"W\n\u000eGetMailItemRsp\u0012\u000f\n\u0007retcode\u0018\u0007 \u0001(\u0005\u0012\u0014\n\fmail_id_list\u0018\u0003 \u0003(\r\u0012\u001e\n\titem_list\u0018\u0002 \u0003(\u000b2\u000b.EquipParamB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetMailItemRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { EquipParamOuterClass.getDescriptor() });
        internal_static_GetMailItemRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetMailItemRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetMailItemRspOuterClass.internal_static_GetMailItemRsp_descriptor, new String[] { "Retcode", "MailIdList", "ItemList" });
        EquipParamOuterClass.getDescriptor();
    }
    
    public static final class GetMailItemRsp extends GeneratedMessageV3 implements GetMailItemRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 7;
        private int retcode_;
        public static final int MAIL_ID_LIST_FIELD_NUMBER = 3;
        private Internal.IntList mailIdList_;
        private int mailIdListMemoizedSerializedSize;
        public static final int ITEM_LIST_FIELD_NUMBER = 2;
        private List<EquipParamOuterClass.EquipParam> itemList_;
        private byte memoizedIsInitialized;
        private static final GetMailItemRsp DEFAULT_INSTANCE;
        private static final Parser<GetMailItemRsp> PARSER;
        
        private GetMailItemRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.mailIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private GetMailItemRsp() {
            this.mailIdListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.mailIdList_ = GeneratedMessageV3.emptyIntList();
            this.itemList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetMailItemRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetMailItemRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 18: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.itemList_ = new ArrayList<EquipParamOuterClass.EquipParam>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.itemList_.add(input.readMessage(EquipParamOuterClass.EquipParam.parser(), extensionRegistry));
                            continue;
                        }
                        case 24: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.mailIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.mailIdList_.addInt(input.readUInt32());
                            continue;
                        }
                        case 26: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.mailIdList_ = GeneratedMessageV3.newIntList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.mailIdList_.addInt(input.readUInt32());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 56: {
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
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.itemList_ = Collections.unmodifiableList((List<? extends EquipParamOuterClass.EquipParam>)this.itemList_);
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.mailIdList_.makeImmutable();
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GetMailItemRspOuterClass.internal_static_GetMailItemRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetMailItemRspOuterClass.internal_static_GetMailItemRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetMailItemRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public List<Integer> getMailIdListList() {
            return this.mailIdList_;
        }
        
        @Override
        public int getMailIdListCount() {
            return this.mailIdList_.size();
        }
        
        @Override
        public int getMailIdList(final int index) {
            return this.mailIdList_.getInt(index);
        }
        
        @Override
        public List<EquipParamOuterClass.EquipParam> getItemListList() {
            return this.itemList_;
        }
        
        @Override
        public List<? extends EquipParamOuterClass.EquipParamOrBuilder> getItemListOrBuilderList() {
            return this.itemList_;
        }
        
        @Override
        public int getItemListCount() {
            return this.itemList_.size();
        }
        
        @Override
        public EquipParamOuterClass.EquipParam getItemList(final int index) {
            return this.itemList_.get(index);
        }
        
        @Override
        public EquipParamOuterClass.EquipParamOrBuilder getItemListOrBuilder(final int index) {
            return this.itemList_.get(index);
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
            for (int i = 0; i < this.itemList_.size(); ++i) {
                output.writeMessage(2, this.itemList_.get(i));
            }
            if (this.getMailIdListList().size() > 0) {
                output.writeUInt32NoTag(26);
                output.writeUInt32NoTag(this.mailIdListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.mailIdList_.size(); ++i) {
                output.writeUInt32NoTag(this.mailIdList_.getInt(i));
            }
            if (this.retcode_ != 0) {
                output.writeInt32(7, this.retcode_);
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
            for (int i = 0; i < this.itemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(2, this.itemList_.get(i));
            }
            int dataSize = 0;
            for (int j = 0; j < this.mailIdList_.size(); ++j) {
                dataSize += CodedOutputStream.computeUInt32SizeNoTag(this.mailIdList_.getInt(j));
            }
            size += dataSize;
            if (!this.getMailIdListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.mailIdListMemoizedSerializedSize = dataSize;
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(7, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetMailItemRsp)) {
                return super.equals(obj);
            }
            final GetMailItemRsp other = (GetMailItemRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getMailIdListList().equals(other.getMailIdListList()) && this.getItemListList().equals(other.getItemListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getRetcode();
            if (this.getMailIdListCount() > 0) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getMailIdListList().hashCode();
            }
            if (this.getItemListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getItemListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetMailItemRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetMailItemRsp.PARSER.parseFrom(data);
        }
        
        public static GetMailItemRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetMailItemRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetMailItemRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetMailItemRsp.PARSER.parseFrom(data);
        }
        
        public static GetMailItemRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetMailItemRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetMailItemRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetMailItemRsp.PARSER.parseFrom(data);
        }
        
        public static GetMailItemRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetMailItemRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetMailItemRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetMailItemRsp.PARSER, input);
        }
        
        public static GetMailItemRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetMailItemRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetMailItemRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetMailItemRsp.PARSER, input);
        }
        
        public static GetMailItemRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetMailItemRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetMailItemRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetMailItemRsp.PARSER, input);
        }
        
        public static GetMailItemRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetMailItemRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetMailItemRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetMailItemRsp prototype) {
            return GetMailItemRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetMailItemRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetMailItemRsp getDefaultInstance() {
            return GetMailItemRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetMailItemRsp> parser() {
            return GetMailItemRsp.PARSER;
        }
        
        @Override
        public Parser<GetMailItemRsp> getParserForType() {
            return GetMailItemRsp.PARSER;
        }
        
        @Override
        public GetMailItemRsp getDefaultInstanceForType() {
            return GetMailItemRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetMailItemRsp();
            PARSER = new AbstractParser<GetMailItemRsp>() {
                @Override
                public GetMailItemRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetMailItemRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetMailItemRspOrBuilder
        {
            private int bitField0_;
            private int retcode_;
            private Internal.IntList mailIdList_;
            private List<EquipParamOuterClass.EquipParam> itemList_;
            private RepeatedFieldBuilderV3<EquipParamOuterClass.EquipParam, EquipParamOuterClass.EquipParam.Builder, EquipParamOuterClass.EquipParamOrBuilder> itemListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetMailItemRspOuterClass.internal_static_GetMailItemRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetMailItemRspOuterClass.internal_static_GetMailItemRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetMailItemRsp.class, Builder.class);
            }
            
            private Builder() {
                this.mailIdList_ = GeneratedMessageV3.emptyIntList();
                this.itemList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.mailIdList_ = GeneratedMessageV3.emptyIntList();
                this.itemList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetMailItemRsp.alwaysUseFieldBuilders) {
                    this.getItemListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.mailIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                if (this.itemListBuilder_ == null) {
                    this.itemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.itemListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetMailItemRspOuterClass.internal_static_GetMailItemRsp_descriptor;
            }
            
            @Override
            public GetMailItemRsp getDefaultInstanceForType() {
                return GetMailItemRsp.getDefaultInstance();
            }
            
            @Override
            public GetMailItemRsp build() {
                final GetMailItemRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetMailItemRsp buildPartial() {
                final GetMailItemRsp result = new GetMailItemRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.retcode_ = this.retcode_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.mailIdList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.mailIdList_ = this.mailIdList_;
                if (this.itemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.itemList_ = Collections.unmodifiableList((List<? extends EquipParamOuterClass.EquipParam>)this.itemList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.itemList_ = this.itemList_;
                }
                else {
                    result.itemList_ = this.itemListBuilder_.build();
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
                if (other instanceof GetMailItemRsp) {
                    return this.mergeFrom((GetMailItemRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetMailItemRsp other) {
                if (other == GetMailItemRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (!other.mailIdList_.isEmpty()) {
                    if (this.mailIdList_.isEmpty()) {
                        this.mailIdList_ = other.mailIdList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureMailIdListIsMutable();
                        this.mailIdList_.addAll(other.mailIdList_);
                    }
                    this.onChanged();
                }
                if (this.itemListBuilder_ == null) {
                    if (!other.itemList_.isEmpty()) {
                        if (this.itemList_.isEmpty()) {
                            this.itemList_ = other.itemList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureItemListIsMutable();
                            this.itemList_.addAll(other.itemList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.itemList_.isEmpty()) {
                    if (this.itemListBuilder_.isEmpty()) {
                        this.itemListBuilder_.dispose();
                        this.itemListBuilder_ = null;
                        this.itemList_ = other.itemList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.itemListBuilder_ = (GetMailItemRsp.alwaysUseFieldBuilders ? this.getItemListFieldBuilder() : null);
                    }
                    else {
                        this.itemListBuilder_.addAllMessages(other.itemList_);
                    }
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
                GetMailItemRsp parsedMessage = null;
                try {
                    parsedMessage = GetMailItemRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetMailItemRsp)e.getUnfinishedMessage();
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
            
            private void ensureMailIdListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.mailIdList_ = GeneratedMessageV3.mutableCopy(this.mailIdList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Integer> getMailIdListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Integer>)this.mailIdList_) : this.mailIdList_;
            }
            
            @Override
            public int getMailIdListCount() {
                return this.mailIdList_.size();
            }
            
            @Override
            public int getMailIdList(final int index) {
                return this.mailIdList_.getInt(index);
            }
            
            public Builder setMailIdList(final int index, final int value) {
                this.ensureMailIdListIsMutable();
                this.mailIdList_.setInt(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addMailIdList(final int value) {
                this.ensureMailIdListIsMutable();
                this.mailIdList_.addInt(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllMailIdList(final Iterable<? extends Integer> values) {
                this.ensureMailIdListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.mailIdList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearMailIdList() {
                this.mailIdList_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private void ensureItemListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.itemList_ = new ArrayList<EquipParamOuterClass.EquipParam>(this.itemList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<EquipParamOuterClass.EquipParam> getItemListList() {
                if (this.itemListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends EquipParamOuterClass.EquipParam>)this.itemList_);
                }
                return this.itemListBuilder_.getMessageList();
            }
            
            @Override
            public int getItemListCount() {
                if (this.itemListBuilder_ == null) {
                    return this.itemList_.size();
                }
                return this.itemListBuilder_.getCount();
            }
            
            @Override
            public EquipParamOuterClass.EquipParam getItemList(final int index) {
                if (this.itemListBuilder_ == null) {
                    return this.itemList_.get(index);
                }
                return this.itemListBuilder_.getMessage(index);
            }
            
            public Builder setItemList(final int index, final EquipParamOuterClass.EquipParam value) {
                if (this.itemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureItemListIsMutable();
                    this.itemList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setItemList(final int index, final EquipParamOuterClass.EquipParam.Builder builderForValue) {
                if (this.itemListBuilder_ == null) {
                    this.ensureItemListIsMutable();
                    this.itemList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addItemList(final EquipParamOuterClass.EquipParam value) {
                if (this.itemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureItemListIsMutable();
                    this.itemList_.add(value);
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addItemList(final int index, final EquipParamOuterClass.EquipParam value) {
                if (this.itemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureItemListIsMutable();
                    this.itemList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addItemList(final EquipParamOuterClass.EquipParam.Builder builderForValue) {
                if (this.itemListBuilder_ == null) {
                    this.ensureItemListIsMutable();
                    this.itemList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addItemList(final int index, final EquipParamOuterClass.EquipParam.Builder builderForValue) {
                if (this.itemListBuilder_ == null) {
                    this.ensureItemListIsMutable();
                    this.itemList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllItemList(final Iterable<? extends EquipParamOuterClass.EquipParam> values) {
                if (this.itemListBuilder_ == null) {
                    this.ensureItemListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.itemList_);
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearItemList() {
                if (this.itemListBuilder_ == null) {
                    this.itemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeItemList(final int index) {
                if (this.itemListBuilder_ == null) {
                    this.ensureItemListIsMutable();
                    this.itemList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.itemListBuilder_.remove(index);
                }
                return this;
            }
            
            public EquipParamOuterClass.EquipParam.Builder getItemListBuilder(final int index) {
                return this.getItemListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public EquipParamOuterClass.EquipParamOrBuilder getItemListOrBuilder(final int index) {
                if (this.itemListBuilder_ == null) {
                    return this.itemList_.get(index);
                }
                return this.itemListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends EquipParamOuterClass.EquipParamOrBuilder> getItemListOrBuilderList() {
                if (this.itemListBuilder_ != null) {
                    return this.itemListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends EquipParamOuterClass.EquipParamOrBuilder>)this.itemList_);
            }
            
            public EquipParamOuterClass.EquipParam.Builder addItemListBuilder() {
                return this.getItemListFieldBuilder().addBuilder(EquipParamOuterClass.EquipParam.getDefaultInstance());
            }
            
            public EquipParamOuterClass.EquipParam.Builder addItemListBuilder(final int index) {
                return this.getItemListFieldBuilder().addBuilder(index, EquipParamOuterClass.EquipParam.getDefaultInstance());
            }
            
            public List<EquipParamOuterClass.EquipParam.Builder> getItemListBuilderList() {
                return this.getItemListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<EquipParamOuterClass.EquipParam, EquipParamOuterClass.EquipParam.Builder, EquipParamOuterClass.EquipParamOrBuilder> getItemListFieldBuilder() {
                if (this.itemListBuilder_ == null) {
                    this.itemListBuilder_ = new RepeatedFieldBuilderV3<EquipParamOuterClass.EquipParam, EquipParamOuterClass.EquipParam.Builder, EquipParamOuterClass.EquipParamOrBuilder>(this.itemList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.itemList_ = null;
                }
                return this.itemListBuilder_;
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
    
    public interface GetMailItemRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        List<Integer> getMailIdListList();
        
        int getMailIdListCount();
        
        int getMailIdList(final int p0);
        
        List<EquipParamOuterClass.EquipParam> getItemListList();
        
        EquipParamOuterClass.EquipParam getItemList(final int p0);
        
        int getItemListCount();
        
        List<? extends EquipParamOuterClass.EquipParamOrBuilder> getItemListOrBuilderList();
        
        EquipParamOuterClass.EquipParamOrBuilder getItemListOrBuilder(final int p0);
    }
}
