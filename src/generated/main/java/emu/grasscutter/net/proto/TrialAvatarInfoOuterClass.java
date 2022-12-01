// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.SingleFieldBuilderV3;
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
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class TrialAvatarInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_TrialAvatarInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TrialAvatarInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TrialAvatarInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TrialAvatarInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0015TrialAvatarInfo.proto\u001a\nItem.proto\u001a\u001cTrialAvatarGrantRecord.proto\"z\n\u000fTrialAvatarInfo\u0012\u0017\n\u000ftrial_avatar_id\u0018\u0001 \u0001(\r\u0012\u001f\n\u0010trial_equip_list\u0018\u0002 \u0003(\u000b2\u0005.Item\u0012-\n\fgrant_record\u0018\u0003 \u0001(\u000b2\u0017.TrialAvatarGrantRecordB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TrialAvatarInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ItemOuterClass.getDescriptor(), TrialAvatarGrantRecordOuterClass.getDescriptor() });
        internal_static_TrialAvatarInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TrialAvatarInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TrialAvatarInfoOuterClass.internal_static_TrialAvatarInfo_descriptor, new String[] { "TrialAvatarId", "TrialEquipList", "GrantRecord" });
        ItemOuterClass.getDescriptor();
        TrialAvatarGrantRecordOuterClass.getDescriptor();
    }
    
    public static final class TrialAvatarInfo extends GeneratedMessageV3 implements TrialAvatarInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int TRIAL_AVATAR_ID_FIELD_NUMBER = 1;
        private int trialAvatarId_;
        public static final int TRIAL_EQUIP_LIST_FIELD_NUMBER = 2;
        private List<ItemOuterClass.Item> trialEquipList_;
        public static final int GRANT_RECORD_FIELD_NUMBER = 3;
        private TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord grantRecord_;
        private byte memoizedIsInitialized;
        private static final TrialAvatarInfo DEFAULT_INSTANCE;
        private static final Parser<TrialAvatarInfo> PARSER;
        
        private TrialAvatarInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TrialAvatarInfo() {
            this.memoizedIsInitialized = -1;
            this.trialEquipList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TrialAvatarInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TrialAvatarInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.trialAvatarId_ = input.readUInt32();
                            continue;
                        }
                        case 18: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.trialEquipList_ = new ArrayList<ItemOuterClass.Item>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.trialEquipList_.add(input.readMessage(ItemOuterClass.Item.parser(), extensionRegistry));
                            continue;
                        }
                        case 26: {
                            TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord.Builder subBuilder = null;
                            if (this.grantRecord_ != null) {
                                subBuilder = this.grantRecord_.toBuilder();
                            }
                            this.grantRecord_ = input.readMessage(TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.grantRecord_);
                                this.grantRecord_ = subBuilder.buildPartial();
                                continue;
                            }
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
                    this.trialEquipList_ = Collections.unmodifiableList((List<? extends ItemOuterClass.Item>)this.trialEquipList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return TrialAvatarInfoOuterClass.internal_static_TrialAvatarInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TrialAvatarInfoOuterClass.internal_static_TrialAvatarInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TrialAvatarInfo.class, Builder.class);
        }
        
        @Override
        public int getTrialAvatarId() {
            return this.trialAvatarId_;
        }
        
        @Override
        public List<ItemOuterClass.Item> getTrialEquipListList() {
            return this.trialEquipList_;
        }
        
        @Override
        public List<? extends ItemOuterClass.ItemOrBuilder> getTrialEquipListOrBuilderList() {
            return this.trialEquipList_;
        }
        
        @Override
        public int getTrialEquipListCount() {
            return this.trialEquipList_.size();
        }
        
        @Override
        public ItemOuterClass.Item getTrialEquipList(final int index) {
            return this.trialEquipList_.get(index);
        }
        
        @Override
        public ItemOuterClass.ItemOrBuilder getTrialEquipListOrBuilder(final int index) {
            return this.trialEquipList_.get(index);
        }
        
        @Override
        public boolean hasGrantRecord() {
            return this.grantRecord_ != null;
        }
        
        @Override
        public TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord getGrantRecord() {
            return (this.grantRecord_ == null) ? TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord.getDefaultInstance() : this.grantRecord_;
        }
        
        @Override
        public TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecordOrBuilder getGrantRecordOrBuilder() {
            return this.getGrantRecord();
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
            if (this.trialAvatarId_ != 0) {
                output.writeUInt32(1, this.trialAvatarId_);
            }
            for (int i = 0; i < this.trialEquipList_.size(); ++i) {
                output.writeMessage(2, this.trialEquipList_.get(i));
            }
            if (this.grantRecord_ != null) {
                output.writeMessage(3, this.getGrantRecord());
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
            if (this.trialAvatarId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.trialAvatarId_);
            }
            for (int i = 0; i < this.trialEquipList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(2, this.trialEquipList_.get(i));
            }
            if (this.grantRecord_ != null) {
                size += CodedOutputStream.computeMessageSize(3, this.getGrantRecord());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TrialAvatarInfo)) {
                return super.equals(obj);
            }
            final TrialAvatarInfo other = (TrialAvatarInfo)obj;
            return this.getTrialAvatarId() == other.getTrialAvatarId() && this.getTrialEquipListList().equals(other.getTrialEquipListList()) && this.hasGrantRecord() == other.hasGrantRecord() && (!this.hasGrantRecord() || this.getGrantRecord().equals(other.getGrantRecord())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getTrialAvatarId();
            if (this.getTrialEquipListCount() > 0) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getTrialEquipListList().hashCode();
            }
            if (this.hasGrantRecord()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getGrantRecord().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TrialAvatarInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TrialAvatarInfo.PARSER.parseFrom(data);
        }
        
        public static TrialAvatarInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TrialAvatarInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TrialAvatarInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TrialAvatarInfo.PARSER.parseFrom(data);
        }
        
        public static TrialAvatarInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TrialAvatarInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TrialAvatarInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TrialAvatarInfo.PARSER.parseFrom(data);
        }
        
        public static TrialAvatarInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TrialAvatarInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TrialAvatarInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TrialAvatarInfo.PARSER, input);
        }
        
        public static TrialAvatarInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TrialAvatarInfo.PARSER, input, extensionRegistry);
        }
        
        public static TrialAvatarInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TrialAvatarInfo.PARSER, input);
        }
        
        public static TrialAvatarInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TrialAvatarInfo.PARSER, input, extensionRegistry);
        }
        
        public static TrialAvatarInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TrialAvatarInfo.PARSER, input);
        }
        
        public static TrialAvatarInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TrialAvatarInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TrialAvatarInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TrialAvatarInfo prototype) {
            return TrialAvatarInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TrialAvatarInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TrialAvatarInfo getDefaultInstance() {
            return TrialAvatarInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<TrialAvatarInfo> parser() {
            return TrialAvatarInfo.PARSER;
        }
        
        @Override
        public Parser<TrialAvatarInfo> getParserForType() {
            return TrialAvatarInfo.PARSER;
        }
        
        @Override
        public TrialAvatarInfo getDefaultInstanceForType() {
            return TrialAvatarInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TrialAvatarInfo();
            PARSER = new AbstractParser<TrialAvatarInfo>() {
                @Override
                public TrialAvatarInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TrialAvatarInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TrialAvatarInfoOrBuilder
        {
            private int bitField0_;
            private int trialAvatarId_;
            private List<ItemOuterClass.Item> trialEquipList_;
            private RepeatedFieldBuilderV3<ItemOuterClass.Item, ItemOuterClass.Item.Builder, ItemOuterClass.ItemOrBuilder> trialEquipListBuilder_;
            private TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord grantRecord_;
            private SingleFieldBuilderV3<TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord, TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord.Builder, TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecordOrBuilder> grantRecordBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TrialAvatarInfoOuterClass.internal_static_TrialAvatarInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TrialAvatarInfoOuterClass.internal_static_TrialAvatarInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(TrialAvatarInfo.class, Builder.class);
            }
            
            private Builder() {
                this.trialEquipList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.trialEquipList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TrialAvatarInfo.alwaysUseFieldBuilders) {
                    this.getTrialEquipListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.trialAvatarId_ = 0;
                if (this.trialEquipListBuilder_ == null) {
                    this.trialEquipList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.trialEquipListBuilder_.clear();
                }
                if (this.grantRecordBuilder_ == null) {
                    this.grantRecord_ = null;
                }
                else {
                    this.grantRecord_ = null;
                    this.grantRecordBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TrialAvatarInfoOuterClass.internal_static_TrialAvatarInfo_descriptor;
            }
            
            @Override
            public TrialAvatarInfo getDefaultInstanceForType() {
                return TrialAvatarInfo.getDefaultInstance();
            }
            
            @Override
            public TrialAvatarInfo build() {
                final TrialAvatarInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TrialAvatarInfo buildPartial() {
                final TrialAvatarInfo result = new TrialAvatarInfo(this);
                final int from_bitField0_ = this.bitField0_;
                result.trialAvatarId_ = this.trialAvatarId_;
                if (this.trialEquipListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.trialEquipList_ = Collections.unmodifiableList((List<? extends ItemOuterClass.Item>)this.trialEquipList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.trialEquipList_ = this.trialEquipList_;
                }
                else {
                    result.trialEquipList_ = this.trialEquipListBuilder_.build();
                }
                if (this.grantRecordBuilder_ == null) {
                    result.grantRecord_ = this.grantRecord_;
                }
                else {
                    result.grantRecord_ = this.grantRecordBuilder_.build();
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
                if (other instanceof TrialAvatarInfo) {
                    return this.mergeFrom((TrialAvatarInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TrialAvatarInfo other) {
                if (other == TrialAvatarInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getTrialAvatarId() != 0) {
                    this.setTrialAvatarId(other.getTrialAvatarId());
                }
                if (this.trialEquipListBuilder_ == null) {
                    if (!other.trialEquipList_.isEmpty()) {
                        if (this.trialEquipList_.isEmpty()) {
                            this.trialEquipList_ = other.trialEquipList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureTrialEquipListIsMutable();
                            this.trialEquipList_.addAll(other.trialEquipList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.trialEquipList_.isEmpty()) {
                    if (this.trialEquipListBuilder_.isEmpty()) {
                        this.trialEquipListBuilder_.dispose();
                        this.trialEquipListBuilder_ = null;
                        this.trialEquipList_ = other.trialEquipList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.trialEquipListBuilder_ = (TrialAvatarInfo.alwaysUseFieldBuilders ? this.getTrialEquipListFieldBuilder() : null);
                    }
                    else {
                        this.trialEquipListBuilder_.addAllMessages(other.trialEquipList_);
                    }
                }
                if (other.hasGrantRecord()) {
                    this.mergeGrantRecord(other.getGrantRecord());
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
                TrialAvatarInfo parsedMessage = null;
                try {
                    parsedMessage = TrialAvatarInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TrialAvatarInfo)e.getUnfinishedMessage();
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
            public int getTrialAvatarId() {
                return this.trialAvatarId_;
            }
            
            public Builder setTrialAvatarId(final int value) {
                this.trialAvatarId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearTrialAvatarId() {
                this.trialAvatarId_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureTrialEquipListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.trialEquipList_ = new ArrayList<ItemOuterClass.Item>(this.trialEquipList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ItemOuterClass.Item> getTrialEquipListList() {
                if (this.trialEquipListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ItemOuterClass.Item>)this.trialEquipList_);
                }
                return this.trialEquipListBuilder_.getMessageList();
            }
            
            @Override
            public int getTrialEquipListCount() {
                if (this.trialEquipListBuilder_ == null) {
                    return this.trialEquipList_.size();
                }
                return this.trialEquipListBuilder_.getCount();
            }
            
            @Override
            public ItemOuterClass.Item getTrialEquipList(final int index) {
                if (this.trialEquipListBuilder_ == null) {
                    return this.trialEquipList_.get(index);
                }
                return this.trialEquipListBuilder_.getMessage(index);
            }
            
            public Builder setTrialEquipList(final int index, final ItemOuterClass.Item value) {
                if (this.trialEquipListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTrialEquipListIsMutable();
                    this.trialEquipList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.trialEquipListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setTrialEquipList(final int index, final ItemOuterClass.Item.Builder builderForValue) {
                if (this.trialEquipListBuilder_ == null) {
                    this.ensureTrialEquipListIsMutable();
                    this.trialEquipList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.trialEquipListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addTrialEquipList(final ItemOuterClass.Item value) {
                if (this.trialEquipListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTrialEquipListIsMutable();
                    this.trialEquipList_.add(value);
                    this.onChanged();
                }
                else {
                    this.trialEquipListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addTrialEquipList(final int index, final ItemOuterClass.Item value) {
                if (this.trialEquipListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTrialEquipListIsMutable();
                    this.trialEquipList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.trialEquipListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addTrialEquipList(final ItemOuterClass.Item.Builder builderForValue) {
                if (this.trialEquipListBuilder_ == null) {
                    this.ensureTrialEquipListIsMutable();
                    this.trialEquipList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.trialEquipListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addTrialEquipList(final int index, final ItemOuterClass.Item.Builder builderForValue) {
                if (this.trialEquipListBuilder_ == null) {
                    this.ensureTrialEquipListIsMutable();
                    this.trialEquipList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.trialEquipListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllTrialEquipList(final Iterable<? extends ItemOuterClass.Item> values) {
                if (this.trialEquipListBuilder_ == null) {
                    this.ensureTrialEquipListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.trialEquipList_);
                    this.onChanged();
                }
                else {
                    this.trialEquipListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearTrialEquipList() {
                if (this.trialEquipListBuilder_ == null) {
                    this.trialEquipList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.trialEquipListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeTrialEquipList(final int index) {
                if (this.trialEquipListBuilder_ == null) {
                    this.ensureTrialEquipListIsMutable();
                    this.trialEquipList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.trialEquipListBuilder_.remove(index);
                }
                return this;
            }
            
            public ItemOuterClass.Item.Builder getTrialEquipListBuilder(final int index) {
                return this.getTrialEquipListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ItemOuterClass.ItemOrBuilder getTrialEquipListOrBuilder(final int index) {
                if (this.trialEquipListBuilder_ == null) {
                    return this.trialEquipList_.get(index);
                }
                return this.trialEquipListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ItemOuterClass.ItemOrBuilder> getTrialEquipListOrBuilderList() {
                if (this.trialEquipListBuilder_ != null) {
                    return this.trialEquipListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ItemOuterClass.ItemOrBuilder>)this.trialEquipList_);
            }
            
            public ItemOuterClass.Item.Builder addTrialEquipListBuilder() {
                return this.getTrialEquipListFieldBuilder().addBuilder(ItemOuterClass.Item.getDefaultInstance());
            }
            
            public ItemOuterClass.Item.Builder addTrialEquipListBuilder(final int index) {
                return this.getTrialEquipListFieldBuilder().addBuilder(index, ItemOuterClass.Item.getDefaultInstance());
            }
            
            public List<ItemOuterClass.Item.Builder> getTrialEquipListBuilderList() {
                return this.getTrialEquipListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ItemOuterClass.Item, ItemOuterClass.Item.Builder, ItemOuterClass.ItemOrBuilder> getTrialEquipListFieldBuilder() {
                if (this.trialEquipListBuilder_ == null) {
                    this.trialEquipListBuilder_ = new RepeatedFieldBuilderV3<ItemOuterClass.Item, ItemOuterClass.Item.Builder, ItemOuterClass.ItemOrBuilder>(this.trialEquipList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.trialEquipList_ = null;
                }
                return this.trialEquipListBuilder_;
            }
            
            @Override
            public boolean hasGrantRecord() {
                return this.grantRecordBuilder_ != null || this.grantRecord_ != null;
            }
            
            @Override
            public TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord getGrantRecord() {
                if (this.grantRecordBuilder_ == null) {
                    return (this.grantRecord_ == null) ? TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord.getDefaultInstance() : this.grantRecord_;
                }
                return this.grantRecordBuilder_.getMessage();
            }
            
            public Builder setGrantRecord(final TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord value) {
                if (this.grantRecordBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.grantRecord_ = value;
                    this.onChanged();
                }
                else {
                    this.grantRecordBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setGrantRecord(final TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord.Builder builderForValue) {
                if (this.grantRecordBuilder_ == null) {
                    this.grantRecord_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.grantRecordBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeGrantRecord(final TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord value) {
                if (this.grantRecordBuilder_ == null) {
                    if (this.grantRecord_ != null) {
                        this.grantRecord_ = TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord.newBuilder(this.grantRecord_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.grantRecord_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.grantRecordBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearGrantRecord() {
                if (this.grantRecordBuilder_ == null) {
                    this.grantRecord_ = null;
                    this.onChanged();
                }
                else {
                    this.grantRecord_ = null;
                    this.grantRecordBuilder_ = null;
                }
                return this;
            }
            
            public TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord.Builder getGrantRecordBuilder() {
                this.onChanged();
                return this.getGrantRecordFieldBuilder().getBuilder();
            }
            
            @Override
            public TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecordOrBuilder getGrantRecordOrBuilder() {
                if (this.grantRecordBuilder_ != null) {
                    return this.grantRecordBuilder_.getMessageOrBuilder();
                }
                return (this.grantRecord_ == null) ? TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord.getDefaultInstance() : this.grantRecord_;
            }
            
            private SingleFieldBuilderV3<TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord, TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord.Builder, TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecordOrBuilder> getGrantRecordFieldBuilder() {
                if (this.grantRecordBuilder_ == null) {
                    this.grantRecordBuilder_ = new SingleFieldBuilderV3<TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord, TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord.Builder, TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecordOrBuilder>(this.getGrantRecord(), this.getParentForChildren(), this.isClean());
                    this.grantRecord_ = null;
                }
                return this.grantRecordBuilder_;
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
    
    public interface TrialAvatarInfoOrBuilder extends MessageOrBuilder
    {
        int getTrialAvatarId();
        
        List<ItemOuterClass.Item> getTrialEquipListList();
        
        ItemOuterClass.Item getTrialEquipList(final int p0);
        
        int getTrialEquipListCount();
        
        List<? extends ItemOuterClass.ItemOrBuilder> getTrialEquipListOrBuilderList();
        
        ItemOuterClass.ItemOrBuilder getTrialEquipListOrBuilder(final int p0);
        
        boolean hasGrantRecord();
        
        TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecord getGrantRecord();
        
        TrialAvatarGrantRecordOuterClass.TrialAvatarGrantRecordOrBuilder getGrantRecordOrBuilder();
    }
}
