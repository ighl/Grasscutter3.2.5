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
import com.google.protobuf.Internal;
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
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class WeaponUpgradeRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_WeaponUpgradeRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_WeaponUpgradeRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private WeaponUpgradeRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return WeaponUpgradeRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0016WeaponUpgradeRsp.proto\u001a\u000fItemParam.proto\"\u008a\u0001\n\u0010WeaponUpgradeRsp\u0012\u0011\n\tcur_level\u0018\u0007 \u0001(\r\u0012\u000f\n\u0007retcode\u0018\u000b \u0001(\u0005\u0012\u0011\n\told_level\u0018\b \u0001(\r\u0012#\n\u000fitem_param_list\u0018\u0002 \u0003(\u000b2\n.ItemParam\u0012\u001a\n\u0012target_weapon_guid\u0018\u0006 \u0001(\u0004B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        WeaponUpgradeRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ItemParamOuterClass.getDescriptor() });
        internal_static_WeaponUpgradeRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_WeaponUpgradeRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(WeaponUpgradeRspOuterClass.internal_static_WeaponUpgradeRsp_descriptor, new String[] { "CurLevel", "Retcode", "OldLevel", "ItemParamList", "TargetWeaponGuid" });
        ItemParamOuterClass.getDescriptor();
    }
    
    public static final class WeaponUpgradeRsp extends GeneratedMessageV3 implements WeaponUpgradeRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int CUR_LEVEL_FIELD_NUMBER = 7;
        private int curLevel_;
        public static final int RETCODE_FIELD_NUMBER = 11;
        private int retcode_;
        public static final int OLD_LEVEL_FIELD_NUMBER = 8;
        private int oldLevel_;
        public static final int ITEM_PARAM_LIST_FIELD_NUMBER = 2;
        private List<ItemParamOuterClass.ItemParam> itemParamList_;
        public static final int TARGET_WEAPON_GUID_FIELD_NUMBER = 6;
        private long targetWeaponGuid_;
        private byte memoizedIsInitialized;
        private static final WeaponUpgradeRsp DEFAULT_INSTANCE;
        private static final Parser<WeaponUpgradeRsp> PARSER;
        
        private WeaponUpgradeRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private WeaponUpgradeRsp() {
            this.memoizedIsInitialized = -1;
            this.itemParamList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new WeaponUpgradeRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private WeaponUpgradeRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.itemParamList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.itemParamList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
                            continue;
                        }
                        case 48: {
                            this.targetWeaponGuid_ = input.readUInt64();
                            continue;
                        }
                        case 56: {
                            this.curLevel_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.oldLevel_ = input.readUInt32();
                            continue;
                        }
                        case 88: {
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.itemParamList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.itemParamList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return WeaponUpgradeRspOuterClass.internal_static_WeaponUpgradeRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return WeaponUpgradeRspOuterClass.internal_static_WeaponUpgradeRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(WeaponUpgradeRsp.class, Builder.class);
        }
        
        @Override
        public int getCurLevel() {
            return this.curLevel_;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public int getOldLevel() {
            return this.oldLevel_;
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
            for (int i = 0; i < this.itemParamList_.size(); ++i) {
                output.writeMessage(2, this.itemParamList_.get(i));
            }
            if (this.targetWeaponGuid_ != 0L) {
                output.writeUInt64(6, this.targetWeaponGuid_);
            }
            if (this.curLevel_ != 0) {
                output.writeUInt32(7, this.curLevel_);
            }
            if (this.oldLevel_ != 0) {
                output.writeUInt32(8, this.oldLevel_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(11, this.retcode_);
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
            for (int i = 0; i < this.itemParamList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(2, this.itemParamList_.get(i));
            }
            if (this.targetWeaponGuid_ != 0L) {
                size += CodedOutputStream.computeUInt64Size(6, this.targetWeaponGuid_);
            }
            if (this.curLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.curLevel_);
            }
            if (this.oldLevel_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.oldLevel_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(11, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WeaponUpgradeRsp)) {
                return super.equals(obj);
            }
            final WeaponUpgradeRsp other = (WeaponUpgradeRsp)obj;
            return this.getCurLevel() == other.getCurLevel() && this.getRetcode() == other.getRetcode() && this.getOldLevel() == other.getOldLevel() && this.getItemParamListList().equals(other.getItemParamListList()) && this.getTargetWeaponGuid() == other.getTargetWeaponGuid() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getCurLevel();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getOldLevel();
            if (this.getItemParamListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getItemParamListList().hashCode();
            }
            hash = 37 * hash + 6;
            hash = 53 * hash + Internal.hashLong(this.getTargetWeaponGuid());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static WeaponUpgradeRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return WeaponUpgradeRsp.PARSER.parseFrom(data);
        }
        
        public static WeaponUpgradeRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeaponUpgradeRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeaponUpgradeRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return WeaponUpgradeRsp.PARSER.parseFrom(data);
        }
        
        public static WeaponUpgradeRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeaponUpgradeRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeaponUpgradeRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return WeaponUpgradeRsp.PARSER.parseFrom(data);
        }
        
        public static WeaponUpgradeRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return WeaponUpgradeRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static WeaponUpgradeRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponUpgradeRsp.PARSER, input);
        }
        
        public static WeaponUpgradeRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponUpgradeRsp.PARSER, input, extensionRegistry);
        }
        
        public static WeaponUpgradeRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WeaponUpgradeRsp.PARSER, input);
        }
        
        public static WeaponUpgradeRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(WeaponUpgradeRsp.PARSER, input, extensionRegistry);
        }
        
        public static WeaponUpgradeRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponUpgradeRsp.PARSER, input);
        }
        
        public static WeaponUpgradeRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(WeaponUpgradeRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return WeaponUpgradeRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final WeaponUpgradeRsp prototype) {
            return WeaponUpgradeRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == WeaponUpgradeRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static WeaponUpgradeRsp getDefaultInstance() {
            return WeaponUpgradeRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<WeaponUpgradeRsp> parser() {
            return WeaponUpgradeRsp.PARSER;
        }
        
        @Override
        public Parser<WeaponUpgradeRsp> getParserForType() {
            return WeaponUpgradeRsp.PARSER;
        }
        
        @Override
        public WeaponUpgradeRsp getDefaultInstanceForType() {
            return WeaponUpgradeRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new WeaponUpgradeRsp();
            PARSER = new AbstractParser<WeaponUpgradeRsp>() {
                @Override
                public WeaponUpgradeRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new WeaponUpgradeRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WeaponUpgradeRspOrBuilder
        {
            private int bitField0_;
            private int curLevel_;
            private int retcode_;
            private int oldLevel_;
            private List<ItemParamOuterClass.ItemParam> itemParamList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> itemParamListBuilder_;
            private long targetWeaponGuid_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return WeaponUpgradeRspOuterClass.internal_static_WeaponUpgradeRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return WeaponUpgradeRspOuterClass.internal_static_WeaponUpgradeRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(WeaponUpgradeRsp.class, Builder.class);
            }
            
            private Builder() {
                this.itemParamList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.itemParamList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (WeaponUpgradeRsp.alwaysUseFieldBuilders) {
                    this.getItemParamListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.curLevel_ = 0;
                this.retcode_ = 0;
                this.oldLevel_ = 0;
                if (this.itemParamListBuilder_ == null) {
                    this.itemParamList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.itemParamListBuilder_.clear();
                }
                this.targetWeaponGuid_ = 0L;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return WeaponUpgradeRspOuterClass.internal_static_WeaponUpgradeRsp_descriptor;
            }
            
            @Override
            public WeaponUpgradeRsp getDefaultInstanceForType() {
                return WeaponUpgradeRsp.getDefaultInstance();
            }
            
            @Override
            public WeaponUpgradeRsp build() {
                final WeaponUpgradeRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public WeaponUpgradeRsp buildPartial() {
                final WeaponUpgradeRsp result = new WeaponUpgradeRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.curLevel_ = this.curLevel_;
                result.retcode_ = this.retcode_;
                result.oldLevel_ = this.oldLevel_;
                if (this.itemParamListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.itemParamList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.itemParamList_);
                        this.bitField0_ &= 0xFFFFFFFE;
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
                if (other instanceof WeaponUpgradeRsp) {
                    return this.mergeFrom((WeaponUpgradeRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final WeaponUpgradeRsp other) {
                if (other == WeaponUpgradeRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getCurLevel() != 0) {
                    this.setCurLevel(other.getCurLevel());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getOldLevel() != 0) {
                    this.setOldLevel(other.getOldLevel());
                }
                if (this.itemParamListBuilder_ == null) {
                    if (!other.itemParamList_.isEmpty()) {
                        if (this.itemParamList_.isEmpty()) {
                            this.itemParamList_ = other.itemParamList_;
                            this.bitField0_ &= 0xFFFFFFFE;
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
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.itemParamListBuilder_ = (WeaponUpgradeRsp.alwaysUseFieldBuilders ? this.getItemParamListFieldBuilder() : null);
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
                WeaponUpgradeRsp parsedMessage = null;
                try {
                    parsedMessage = WeaponUpgradeRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (WeaponUpgradeRsp)e.getUnfinishedMessage();
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
            public int getCurLevel() {
                return this.curLevel_;
            }
            
            public Builder setCurLevel(final int value) {
                this.curLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurLevel() {
                this.curLevel_ = 0;
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
            public int getOldLevel() {
                return this.oldLevel_;
            }
            
            public Builder setOldLevel(final int value) {
                this.oldLevel_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearOldLevel() {
                this.oldLevel_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureItemParamListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.itemParamList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.itemParamList_);
                    this.bitField0_ |= 0x1;
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
                    this.bitField0_ &= 0xFFFFFFFE;
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
                    this.itemParamListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.itemParamList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
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
    
    public interface WeaponUpgradeRspOrBuilder extends MessageOrBuilder
    {
        int getCurLevel();
        
        int getRetcode();
        
        int getOldLevel();
        
        List<ItemParamOuterClass.ItemParam> getItemParamListList();
        
        ItemParamOuterClass.ItemParam getItemParamList(final int p0);
        
        int getItemParamListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getItemParamListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getItemParamListOrBuilder(final int p0);
        
        long getTargetWeaponGuid();
    }
}
