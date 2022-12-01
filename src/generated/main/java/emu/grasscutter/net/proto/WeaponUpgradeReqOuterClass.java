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

public final class WeaponUpgradeReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_WeaponUpgradeReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WeaponUpgradeReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WeaponUpgradeReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WeaponUpgradeReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016WeaponUpgradeReq.proto\u001a\u000fItemParam.proto\"r\n\u0010WeaponUpgradeReq\u0012\u001d\n\u0015food_weapon_guid_list\u0018\u0001 \u0003(\u0004\u0012#\n\u000fitem_param_list\u0018\u000f \u0003(\u000b2\n.ItemParam\u0012\u001a\n\u0012target_weapon_guid\u0018\u0004 \u0001(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WeaponUpgradeReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ItemParamOuterClass.getDescriptor() });
        internal_static_WeaponUpgradeReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WeaponUpgradeReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WeaponUpgradeReqOuterClass.internal_static_WeaponUpgradeReq_descriptor, new String[] { "FoodWeaponGuidList", "ItemParamList", "TargetWeaponGuid" });
        ItemParamOuterClass.getDescriptor();
    }
    
    public static final class WeaponUpgradeReq extends GeneratedMessageV3 implements WeaponUpgradeReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FOOD_WEAPON_GUID_LIST_FIELD_NUMBER = 1;
        private Internal.LongList foodWeaponGuidList_;
        private int foodWeaponGuidListMemoizedSerializedSize;
        public static final int ITEM_PARAM_LIST_FIELD_NUMBER = 15;
        private List<ItemParamOuterClass.ItemParam> itemParamList_;
        public static final int TARGET_WEAPON_GUID_FIELD_NUMBER = 4;
        private long targetWeaponGuid_;
        private byte memoizedIsInitialized;
        private static final WeaponUpgradeReq DEFAULT_INSTANCE;
        private static final Parser<WeaponUpgradeReq> PARSER;
        
        private WeaponUpgradeReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.foodWeaponGuidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
        }
        
        private WeaponUpgradeReq() {
            this.foodWeaponGuidListMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.foodWeaponGuidList_ = GeneratedMessageV3.emptyLongList();
            this.itemParamList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WeaponUpgradeReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WeaponUpgradeReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.foodWeaponGuidList_ = GeneratedMessageV3.newLongList();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.foodWeaponGuidList_.addLong(input.readUInt64());
                            continue;
                        }
                        case 10: {
                            final int length = input.readRawVarint32();
                            final int limit = input.pushLimit(length);
                            if ((mutable_bitField0_ & 0x1) == 0x0 && input.getBytesUntilLimit() > 0) {
                                this.foodWeaponGuidList_ = GeneratedMessageV3.newLongList();
                                mutable_bitField0_ |= 0x1;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                this.foodWeaponGuidList_.addLong(input.readUInt64());
                            }
                            input.popLimit(limit);
                            continue;
                        }
                        case 32: {
                            this.targetWeaponGuid_ = input.readUInt64();
                            continue;
                        }
                        case 122: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.itemParamList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.itemParamList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
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
                    this.foodWeaponGuidList_.makeImmutable();
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.itemParamList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.itemParamList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return WeaponUpgradeReqOuterClass.internal_static_WeaponUpgradeReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WeaponUpgradeReqOuterClass.internal_static_WeaponUpgradeReq_fieldAccessorTable.ensureFieldAccessorsInitialized(WeaponUpgradeReq.class, Builder.class);
        }
        
        @Override
        public List<Long> getFoodWeaponGuidListList() {
            return this.foodWeaponGuidList_;
        }
        
        @Override
        public int getFoodWeaponGuidListCount() {
            return this.foodWeaponGuidList_.size();
        }
        
        @Override
        public long getFoodWeaponGuidList(final int index) {
            return this.foodWeaponGuidList_.getLong(index);
        }
        
        @Override
        public List<ItemParamOuterClass.ItemParam> getItemParamListList() {
            return this.itemParamList_;
        }
        
        @Override
        public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getItemParamListOrBuilderList() {
            return this.itemParamList_;
        }
        
        @Override
        public int getItemParamListCount() {
            return this.itemParamList_.size();
        }
        
        @Override
        public ItemParamOuterClass.ItemParam getItemParamList(final int index) {
            return this.itemParamList_.get(index);
        }
        
        @Override
        public ItemParamOuterClass.ItemParamOrBuilder getItemParamListOrBuilder(final int index) {
            return this.itemParamList_.get(index);
        }
        
        @Override
        public long getTargetWeaponGuid() {
            return this.targetWeaponGuid_;
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
            if (this.getFoodWeaponGuidListList().size() > 0) {
                output.writeUInt32NoTag(10);
                output.writeUInt32NoTag(this.foodWeaponGuidListMemoizedSerializedSize);
            }
            for (int i = 0; i < this.foodWeaponGuidList_.size(); ++i) {
                output.writeUInt64NoTag(this.foodWeaponGuidList_.getLong(i));
            }
            if (this.targetWeaponGuid_ != 0L) {
                output.writeUInt64(4, this.targetWeaponGuid_);
            }
            for (int i = 0; i < this.itemParamList_.size(); ++i) {
                output.writeMessage(15, this.itemParamList_.get(i));
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
            int dataSize = 0;
            for (int i = 0; i < this.foodWeaponGuidList_.size(); ++i) {
                dataSize += CodedOutputStream.computeUInt64SizeNoTag(this.foodWeaponGuidList_.getLong(i));
            }
            size += dataSize;
            if (!this.getFoodWeaponGuidListList().isEmpty()) {
                size = ++size + CodedOutputStream.computeInt32SizeNoTag(dataSize);
            }
            this.foodWeaponGuidListMemoizedSerializedSize = dataSize;
            if (this.targetWeaponGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(4, this.targetWeaponGuid_);
            }
            for (int j = 0; j < this.itemParamList_.size(); ++j) {
                size += CodedOutputStream.computeMessageSize(15, this.itemParamList_.get(j));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WeaponUpgradeReq)) {
                return super.equals(obj);
            }
            final WeaponUpgradeReq other = (WeaponUpgradeReq)obj;
            return this.getFoodWeaponGuidListList().equals(other.getFoodWeaponGuidListList()) && this.getItemParamListList().equals(other.getItemParamListList()) && this.getTargetWeaponGuid() == other.getTargetWeaponGuid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getFoodWeaponGuidListCount() > 0) {
                hash = 37 * hash + 1;
                hash = 53 * hash + this.getFoodWeaponGuidListList().hashCode();
            }
            if (this.getItemParamListCount() > 0) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getItemParamListList().hashCode();
            }
            hash = 37 * hash + 4;
            hash = 53 * hash + Internal.hashLong(this.getTargetWeaponGuid());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WeaponUpgradeReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WeaponUpgradeReq.PARSER.parseFrom(data);
        }
        
        public static WeaponUpgradeReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeaponUpgradeReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeaponUpgradeReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WeaponUpgradeReq.PARSER.parseFrom(data);
        }
        
        public static WeaponUpgradeReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeaponUpgradeReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeaponUpgradeReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WeaponUpgradeReq.PARSER.parseFrom(data);
        }
        
        public static WeaponUpgradeReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeaponUpgradeReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeaponUpgradeReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponUpgradeReq.PARSER, input);
        }
        
        public static WeaponUpgradeReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponUpgradeReq.PARSER, input, extensionRegistry);
        }
        
        public static WeaponUpgradeReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WeaponUpgradeReq.PARSER, input);
        }
        
        public static WeaponUpgradeReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WeaponUpgradeReq.PARSER, input, extensionRegistry);
        }
        
        public static WeaponUpgradeReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponUpgradeReq.PARSER, input);
        }
        
        public static WeaponUpgradeReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponUpgradeReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WeaponUpgradeReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WeaponUpgradeReq prototype) {
            return WeaponUpgradeReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WeaponUpgradeReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WeaponUpgradeReq getDefaultInstance() {
            return WeaponUpgradeReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<WeaponUpgradeReq> parser() {
            return WeaponUpgradeReq.PARSER;
        }
        
        @Override
        public Parser<WeaponUpgradeReq> getParserForType() {
            return WeaponUpgradeReq.PARSER;
        }
        
        @Override
        public WeaponUpgradeReq getDefaultInstanceForType() {
            return WeaponUpgradeReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WeaponUpgradeReq();
            PARSER = new AbstractParser<WeaponUpgradeReq>() {
                @Override
                public WeaponUpgradeReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WeaponUpgradeReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WeaponUpgradeReqOrBuilder
        {
            private int bitField0_;
            private Internal.LongList foodWeaponGuidList_;
            private List<ItemParamOuterClass.ItemParam> itemParamList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> itemParamListBuilder_;
            private long targetWeaponGuid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WeaponUpgradeReqOuterClass.internal_static_WeaponUpgradeReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WeaponUpgradeReqOuterClass.internal_static_WeaponUpgradeReq_fieldAccessorTable.ensureFieldAccessorsInitialized(WeaponUpgradeReq.class, Builder.class);
            }
            
            private Builder() {
                this.foodWeaponGuidList_ = GeneratedMessageV3.emptyLongList();
                this.itemParamList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.foodWeaponGuidList_ = GeneratedMessageV3.emptyLongList();
                this.itemParamList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WeaponUpgradeReq.alwaysUseFieldBuilders) {
                    this.getItemParamListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.foodWeaponGuidList_ = GeneratedMessageV3.emptyLongList();
                this.bitField0_ &= 0xFFFFFFFE;
                if (this.itemParamListBuilder_ == null) {
                    this.itemParamList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.itemParamListBuilder_.clear();
                }
                this.targetWeaponGuid_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WeaponUpgradeReqOuterClass.internal_static_WeaponUpgradeReq_descriptor;
            }
            
            @Override
            public WeaponUpgradeReq getDefaultInstanceForType() {
                return WeaponUpgradeReq.getDefaultInstance();
            }
            
            @Override
            public WeaponUpgradeReq build() {
                final WeaponUpgradeReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WeaponUpgradeReq buildPartial() {
                final WeaponUpgradeReq result = new WeaponUpgradeReq(this);
                final int from_bitField0_ = this.bitField0_;
                if ((this.bitField0_ & 0x1) != 0x0) {
                    this.foodWeaponGuidList_.makeImmutable();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                result.foodWeaponGuidList_ = this.foodWeaponGuidList_;
                if (this.itemParamListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.itemParamList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.itemParamList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.itemParamList_ = this.itemParamList_;
                }
                else {
                    result.itemParamList_ = this.itemParamListBuilder_.build();
                }
                result.targetWeaponGuid_ = this.targetWeaponGuid_;
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
                if (other instanceof WeaponUpgradeReq) {
                    return this.mergeFrom((WeaponUpgradeReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WeaponUpgradeReq other) {
                if (other == WeaponUpgradeReq.getDefaultInstance()) {
                    return this;
                }
                if (!other.foodWeaponGuidList_.isEmpty()) {
                    if (this.foodWeaponGuidList_.isEmpty()) {
                        this.foodWeaponGuidList_ = other.foodWeaponGuidList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    else {
                        this.ensureFoodWeaponGuidListIsMutable();
                        this.foodWeaponGuidList_.addAll(other.foodWeaponGuidList_);
                    }
                    this.onChanged();
                }
                if (this.itemParamListBuilder_ == null) {
                    if (!other.itemParamList_.isEmpty()) {
                        if (this.itemParamList_.isEmpty()) {
                            this.itemParamList_ = other.itemParamList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureItemParamListIsMutable();
                            this.itemParamList_.addAll(other.itemParamList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.itemParamList_.isEmpty()) {
                    if (this.itemParamListBuilder_.isEmpty()) {
                        this.itemParamListBuilder_.dispose();
                        this.itemParamListBuilder_ = null;
                        this.itemParamList_ = other.itemParamList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.itemParamListBuilder_ = (WeaponUpgradeReq.alwaysUseFieldBuilders ? this.getItemParamListFieldBuilder() : null);
                    }
                    else {
                        this.itemParamListBuilder_.addAllMessages(other.itemParamList_);
                    }
                }
                if (other.getTargetWeaponGuid() != 0L) {
                    this.setTargetWeaponGuid(other.getTargetWeaponGuid());
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
                WeaponUpgradeReq parsedMessage = null;
                try {
                    parsedMessage = WeaponUpgradeReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WeaponUpgradeReq)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureFoodWeaponGuidListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.foodWeaponGuidList_ = GeneratedMessageV3.mutableCopy(this.foodWeaponGuidList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<Long> getFoodWeaponGuidListList() {
                return ((this.bitField0_ & 0x1) != 0x0) ? Collections.unmodifiableList((List<? extends Long>)this.foodWeaponGuidList_) : this.foodWeaponGuidList_;
            }
            
            @Override
            public int getFoodWeaponGuidListCount() {
                return this.foodWeaponGuidList_.size();
            }
            
            @Override
            public long getFoodWeaponGuidList(final int index) {
                return this.foodWeaponGuidList_.getLong(index);
            }
            
            public Builder setFoodWeaponGuidList(final int index, final long value) {
                this.ensureFoodWeaponGuidListIsMutable();
                this.foodWeaponGuidList_.setLong(index, value);
                this.onChanged();
                return this;
            }
            
            public Builder addFoodWeaponGuidList(final long value) {
                this.ensureFoodWeaponGuidListIsMutable();
                this.foodWeaponGuidList_.addLong(value);
                this.onChanged();
                return this;
            }
            
            public Builder addAllFoodWeaponGuidList(final Iterable<? extends Long> values) {
                this.ensureFoodWeaponGuidListIsMutable();
                AbstractMessageLite.Builder.addAll(values, this.foodWeaponGuidList_);
                this.onChanged();
                return this;
            }
            
            public Builder clearFoodWeaponGuidList() {
                this.foodWeaponGuidList_ = GeneratedMessageV3.emptyLongList();
                this.bitField0_ &= 0xFFFFFFFE;
                this.onChanged();
                return this;
            }
            
            private void ensureItemParamListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.itemParamList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.itemParamList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<ItemParamOuterClass.ItemParam> getItemParamListList() {
                if (this.itemParamListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.itemParamList_);
                }
                return this.itemParamListBuilder_.getMessageList();
            }
            
            @Override
            public int getItemParamListCount() {
                if (this.itemParamListBuilder_ == null) {
                    return this.itemParamList_.size();
                }
                return this.itemParamListBuilder_.getCount();
            }
            
            @Override
            public ItemParamOuterClass.ItemParam getItemParamList(final int index) {
                if (this.itemParamListBuilder_ == null) {
                    return this.itemParamList_.get(index);
                }
                return this.itemParamListBuilder_.getMessage(index);
            }
            
            public Builder setItemParamList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.itemParamListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureItemParamListIsMutable();
                    this.itemParamList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.itemParamListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setItemParamList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.itemParamListBuilder_ == null) {
                    this.ensureItemParamListIsMutable();
                    this.itemParamList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.itemParamListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addItemParamList(final ItemParamOuterClass.ItemParam value) {
                if (this.itemParamListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureItemParamListIsMutable();
                    this.itemParamList_.add(value);
                    this.onChanged();
                }
                else {
                    this.itemParamListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addItemParamList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.itemParamListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureItemParamListIsMutable();
                    this.itemParamList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.itemParamListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addItemParamList(final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.itemParamListBuilder_ == null) {
                    this.ensureItemParamListIsMutable();
                    this.itemParamList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.itemParamListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addItemParamList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.itemParamListBuilder_ == null) {
                    this.ensureItemParamListIsMutable();
                    this.itemParamList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.itemParamListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllItemParamList(final Iterable<? extends ItemParamOuterClass.ItemParam> values) {
                if (this.itemParamListBuilder_ == null) {
                    this.ensureItemParamListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.itemParamList_);
                    this.onChanged();
                }
                else {
                    this.itemParamListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearItemParamList() {
                if (this.itemParamListBuilder_ == null) {
                    this.itemParamList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.itemParamListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeItemParamList(final int index) {
                if (this.itemParamListBuilder_ == null) {
                    this.ensureItemParamListIsMutable();
                    this.itemParamList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.itemParamListBuilder_.remove(index);
                }
                return this;
            }
            
            public ItemParamOuterClass.ItemParam.Builder getItemParamListBuilder(final int index) {
                return this.getItemParamListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ItemParamOuterClass.ItemParamOrBuilder getItemParamListOrBuilder(final int index) {
                if (this.itemParamListBuilder_ == null) {
                    return this.itemParamList_.get(index);
                }
                return this.itemParamListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getItemParamListOrBuilderList() {
                if (this.itemParamListBuilder_ != null) {
                    return this.itemParamListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParamOrBuilder>)this.itemParamList_);
            }
            
            public ItemParamOuterClass.ItemParam.Builder addItemParamListBuilder() {
                return this.getItemParamListFieldBuilder().addBuilder(ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public ItemParamOuterClass.ItemParam.Builder addItemParamListBuilder(final int index) {
                return this.getItemParamListFieldBuilder().addBuilder(index, ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public List<ItemParamOuterClass.ItemParam.Builder> getItemParamListBuilderList() {
                return this.getItemParamListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> getItemParamListFieldBuilder() {
                if (this.itemParamListBuilder_ == null) {
                    this.itemParamListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.itemParamList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.itemParamList_ = null;
                }
                return this.itemParamListBuilder_;
            }
            
            @Override
            public long getTargetWeaponGuid() {
                return this.targetWeaponGuid_;
            }
            
            public Builder setTargetWeaponGuid(final long value) {
                this.targetWeaponGuid_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTargetWeaponGuid() {
                this.targetWeaponGuid_ = 0L;
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
    
    public interface WeaponUpgradeReqOrBuilder extends MessageOrBuilder
    {
        List<Long> getFoodWeaponGuidListList();
        
        int getFoodWeaponGuidListCount();
        
        long getFoodWeaponGuidList(final int p0);
        
        List<ItemParamOuterClass.ItemParam> getItemParamListList();
        
        ItemParamOuterClass.ItemParam getItemParamList(final int p0);
        
        int getItemParamListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getItemParamListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getItemParamListOrBuilder(final int p0);
        
        long getTargetWeaponGuid();
    }
}
