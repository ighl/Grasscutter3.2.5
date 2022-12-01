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
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class TakeBattlePassRewardRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_TakeBattlePassRewardRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_TakeBattlePassRewardRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private TakeBattlePassRewardRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return TakeBattlePassRewardRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dTakeBattlePassRewardRsp.proto\u001a BattlePassRewardTakeOption.proto\u001a\u000fItemParam.proto\"\u0080\u0001\n\u0017TakeBattlePassRewardRsp\u0012\u001d\n\titem_list\u0018\u0007 \u0003(\u000b2\n.ItemParam\u0012\u000f\n\u0007retcode\u0018\r \u0001(\u0005\u00125\n\u0010take_option_list\u0018\t \u0003(\u000b2\u001b.BattlePassRewardTakeOptionB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        TakeBattlePassRewardRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { BattlePassRewardTakeOptionOuterClass.getDescriptor(), ItemParamOuterClass.getDescriptor() });
        internal_static_TakeBattlePassRewardRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_TakeBattlePassRewardRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(TakeBattlePassRewardRspOuterClass.internal_static_TakeBattlePassRewardRsp_descriptor, new String[] { "ItemList", "Retcode", "TakeOptionList" });
        BattlePassRewardTakeOptionOuterClass.getDescriptor();
        ItemParamOuterClass.getDescriptor();
    }
    
    public static final class TakeBattlePassRewardRsp extends GeneratedMessageV3 implements TakeBattlePassRewardRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int ITEM_LIST_FIELD_NUMBER = 7;
        private List<ItemParamOuterClass.ItemParam> itemList_;
        public static final int RETCODE_FIELD_NUMBER = 13;
        private int retcode_;
        public static final int TAKE_OPTION_LIST_FIELD_NUMBER = 9;
        private List<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption> takeOptionList_;
        private byte memoizedIsInitialized;
        private static final TakeBattlePassRewardRsp DEFAULT_INSTANCE;
        private static final Parser<TakeBattlePassRewardRsp> PARSER;
        
        private TakeBattlePassRewardRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private TakeBattlePassRewardRsp() {
            this.memoizedIsInitialized = -1;
            this.itemList_ = Collections.emptyList();
            this.takeOptionList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new TakeBattlePassRewardRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private TakeBattlePassRewardRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 58: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.itemList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.itemList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
                            continue;
                        }
                        case 74: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.takeOptionList_ = new ArrayList<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.takeOptionList_.add(input.readMessage(BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.parser(), extensionRegistry));
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
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.itemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.itemList_);
                }
                if ((mutable_bitField0_ & 0x2) != 0x0) {
                    this.takeOptionList_ = Collections.unmodifiableList((List<? extends BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption>)this.takeOptionList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return TakeBattlePassRewardRspOuterClass.internal_static_TakeBattlePassRewardRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return TakeBattlePassRewardRspOuterClass.internal_static_TakeBattlePassRewardRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(TakeBattlePassRewardRsp.class, Builder.class);
        }
        
        @Override
        public List<ItemParamOuterClass.ItemParam> getItemListList() {
            return this.itemList_;
        }
        
        @Override
        public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getItemListOrBuilderList() {
            return this.itemList_;
        }
        
        @Override
        public int getItemListCount() {
            return this.itemList_.size();
        }
        
        @Override
        public ItemParamOuterClass.ItemParam getItemList(final int index) {
            return this.itemList_.get(index);
        }
        
        @Override
        public ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(final int index) {
            return this.itemList_.get(index);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public List<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption> getTakeOptionListList() {
            return this.takeOptionList_;
        }
        
        @Override
        public List<? extends BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder> getTakeOptionListOrBuilderList() {
            return this.takeOptionList_;
        }
        
        @Override
        public int getTakeOptionListCount() {
            return this.takeOptionList_.size();
        }
        
        @Override
        public BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption getTakeOptionList(final int index) {
            return this.takeOptionList_.get(index);
        }
        
        @Override
        public BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder getTakeOptionListOrBuilder(final int index) {
            return this.takeOptionList_.get(index);
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
            for (int i = 0; i < this.itemList_.size(); ++i) {
                output.writeMessage(7, this.itemList_.get(i));
            }
            for (int i = 0; i < this.takeOptionList_.size(); ++i) {
                output.writeMessage(9, this.takeOptionList_.get(i));
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
            for (int i = 0; i < this.itemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(7, this.itemList_.get(i));
            }
            for (int i = 0; i < this.takeOptionList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(9, this.takeOptionList_.get(i));
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
            if (!(obj instanceof TakeBattlePassRewardRsp)) {
                return super.equals(obj);
            }
            final TakeBattlePassRewardRsp other = (TakeBattlePassRewardRsp)obj;
            return this.getItemListList().equals(other.getItemListList()) && this.getRetcode() == other.getRetcode() && this.getTakeOptionListList().equals(other.getTakeOptionListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getItemListCount() > 0) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getItemListList().hashCode();
            }
            hash = 37 * hash + 13;
            hash = 53 * hash + this.getRetcode();
            if (this.getTakeOptionListCount() > 0) {
                hash = 37 * hash + 9;
                hash = 53 * hash + this.getTakeOptionListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static TakeBattlePassRewardRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return TakeBattlePassRewardRsp.PARSER.parseFrom(data);
        }
        
        public static TakeBattlePassRewardRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeBattlePassRewardRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeBattlePassRewardRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return TakeBattlePassRewardRsp.PARSER.parseFrom(data);
        }
        
        public static TakeBattlePassRewardRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeBattlePassRewardRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeBattlePassRewardRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return TakeBattlePassRewardRsp.PARSER.parseFrom(data);
        }
        
        public static TakeBattlePassRewardRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return TakeBattlePassRewardRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static TakeBattlePassRewardRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeBattlePassRewardRsp.PARSER, input);
        }
        
        public static TakeBattlePassRewardRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeBattlePassRewardRsp.PARSER, input, extensionRegistry);
        }
        
        public static TakeBattlePassRewardRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakeBattlePassRewardRsp.PARSER, input);
        }
        
        public static TakeBattlePassRewardRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(TakeBattlePassRewardRsp.PARSER, input, extensionRegistry);
        }
        
        public static TakeBattlePassRewardRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeBattlePassRewardRsp.PARSER, input);
        }
        
        public static TakeBattlePassRewardRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(TakeBattlePassRewardRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return TakeBattlePassRewardRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final TakeBattlePassRewardRsp prototype) {
            return TakeBattlePassRewardRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == TakeBattlePassRewardRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static TakeBattlePassRewardRsp getDefaultInstance() {
            return TakeBattlePassRewardRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<TakeBattlePassRewardRsp> parser() {
            return TakeBattlePassRewardRsp.PARSER;
        }
        
        @Override
        public Parser<TakeBattlePassRewardRsp> getParserForType() {
            return TakeBattlePassRewardRsp.PARSER;
        }
        
        @Override
        public TakeBattlePassRewardRsp getDefaultInstanceForType() {
            return TakeBattlePassRewardRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new TakeBattlePassRewardRsp();
            PARSER = new AbstractParser<TakeBattlePassRewardRsp>() {
                @Override
                public TakeBattlePassRewardRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new TakeBattlePassRewardRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TakeBattlePassRewardRspOrBuilder
        {
            private int bitField0_;
            private List<ItemParamOuterClass.ItemParam> itemList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> itemListBuilder_;
            private int retcode_;
            private List<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption> takeOptionList_;
            private RepeatedFieldBuilderV3<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption, BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder, BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder> takeOptionListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return TakeBattlePassRewardRspOuterClass.internal_static_TakeBattlePassRewardRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return TakeBattlePassRewardRspOuterClass.internal_static_TakeBattlePassRewardRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(TakeBattlePassRewardRsp.class, Builder.class);
            }
            
            private Builder() {
                this.itemList_ = Collections.emptyList();
                this.takeOptionList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.itemList_ = Collections.emptyList();
                this.takeOptionList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (TakeBattlePassRewardRsp.alwaysUseFieldBuilders) {
                    this.getItemListFieldBuilder();
                    this.getTakeOptionListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.itemListBuilder_ == null) {
                    this.itemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.itemListBuilder_.clear();
                }
                this.retcode_ = 0;
                if (this.takeOptionListBuilder_ == null) {
                    this.takeOptionList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.takeOptionListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return TakeBattlePassRewardRspOuterClass.internal_static_TakeBattlePassRewardRsp_descriptor;
            }
            
            @Override
            public TakeBattlePassRewardRsp getDefaultInstanceForType() {
                return TakeBattlePassRewardRsp.getDefaultInstance();
            }
            
            @Override
            public TakeBattlePassRewardRsp build() {
                final TakeBattlePassRewardRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public TakeBattlePassRewardRsp buildPartial() {
                final TakeBattlePassRewardRsp result = new TakeBattlePassRewardRsp(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.itemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.itemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.itemList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.itemList_ = this.itemList_;
                }
                else {
                    result.itemList_ = this.itemListBuilder_.build();
                }
                result.retcode_ = this.retcode_;
                if (this.takeOptionListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.takeOptionList_ = Collections.unmodifiableList((List<? extends BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption>)this.takeOptionList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.takeOptionList_ = this.takeOptionList_;
                }
                else {
                    result.takeOptionList_ = this.takeOptionListBuilder_.build();
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
                if (other instanceof TakeBattlePassRewardRsp) {
                    return this.mergeFrom((TakeBattlePassRewardRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final TakeBattlePassRewardRsp other) {
                if (other == TakeBattlePassRewardRsp.getDefaultInstance()) {
                    return this;
                }
                if (this.itemListBuilder_ == null) {
                    if (!other.itemList_.isEmpty()) {
                        if (this.itemList_.isEmpty()) {
                            this.itemList_ = other.itemList_;
                            this.bitField0_ &= 0xFFFFFFFE;
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
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.itemListBuilder_ = (TakeBattlePassRewardRsp.alwaysUseFieldBuilders ? this.getItemListFieldBuilder() : null);
                    }
                    else {
                        this.itemListBuilder_.addAllMessages(other.itemList_);
                    }
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (this.takeOptionListBuilder_ == null) {
                    if (!other.takeOptionList_.isEmpty()) {
                        if (this.takeOptionList_.isEmpty()) {
                            this.takeOptionList_ = other.takeOptionList_;
                            this.bitField0_ &= 0xFFFFFFFD;
                        }
                        else {
                            this.ensureTakeOptionListIsMutable();
                            this.takeOptionList_.addAll(other.takeOptionList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.takeOptionList_.isEmpty()) {
                    if (this.takeOptionListBuilder_.isEmpty()) {
                        this.takeOptionListBuilder_.dispose();
                        this.takeOptionListBuilder_ = null;
                        this.takeOptionList_ = other.takeOptionList_;
                        this.bitField0_ &= 0xFFFFFFFD;
                        this.takeOptionListBuilder_ = (TakeBattlePassRewardRsp.alwaysUseFieldBuilders ? this.getTakeOptionListFieldBuilder() : null);
                    }
                    else {
                        this.takeOptionListBuilder_.addAllMessages(other.takeOptionList_);
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
                TakeBattlePassRewardRsp parsedMessage = null;
                try {
                    parsedMessage = TakeBattlePassRewardRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (TakeBattlePassRewardRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureItemListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.itemList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.itemList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ItemParamOuterClass.ItemParam> getItemListList() {
                if (this.itemListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.itemList_);
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
            public ItemParamOuterClass.ItemParam getItemList(final int index) {
                if (this.itemListBuilder_ == null) {
                    return this.itemList_.get(index);
                }
                return this.itemListBuilder_.getMessage(index);
            }
            
            public Builder setItemList(final int index, final ItemParamOuterClass.ItemParam value) {
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
            
            public Builder setItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
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
            
            public Builder addItemList(final ItemParamOuterClass.ItemParam value) {
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
            
            public Builder addItemList(final int index, final ItemParamOuterClass.ItemParam value) {
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
            
            public Builder addItemList(final ItemParamOuterClass.ItemParam.Builder builderForValue) {
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
            
            public Builder addItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
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
            
            public Builder addAllItemList(final Iterable<? extends ItemParamOuterClass.ItemParam> values) {
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
                    this.bitField0_ &= 0xFFFFFFFE;
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
            
            public ItemParamOuterClass.ItemParam.Builder getItemListBuilder(final int index) {
                return this.getItemListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(final int index) {
                if (this.itemListBuilder_ == null) {
                    return this.itemList_.get(index);
                }
                return this.itemListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getItemListOrBuilderList() {
                if (this.itemListBuilder_ != null) {
                    return this.itemListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParamOrBuilder>)this.itemList_);
            }
            
            public ItemParamOuterClass.ItemParam.Builder addItemListBuilder() {
                return this.getItemListFieldBuilder().addBuilder(ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public ItemParamOuterClass.ItemParam.Builder addItemListBuilder(final int index) {
                return this.getItemListFieldBuilder().addBuilder(index, ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public List<ItemParamOuterClass.ItemParam.Builder> getItemListBuilderList() {
                return this.getItemListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> getItemListFieldBuilder() {
                if (this.itemListBuilder_ == null) {
                    this.itemListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.itemList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.itemList_ = null;
                }
                return this.itemListBuilder_;
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
            
            private void ensureTakeOptionListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.takeOptionList_ = new ArrayList<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption>(this.takeOptionList_);
                    this.bitField0_ |= 0x2;
                }
            }
            
            @Override
            public List<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption> getTakeOptionListList() {
                if (this.takeOptionListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption>)this.takeOptionList_);
                }
                return this.takeOptionListBuilder_.getMessageList();
            }
            
            @Override
            public int getTakeOptionListCount() {
                if (this.takeOptionListBuilder_ == null) {
                    return this.takeOptionList_.size();
                }
                return this.takeOptionListBuilder_.getCount();
            }
            
            @Override
            public BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption getTakeOptionList(final int index) {
                if (this.takeOptionListBuilder_ == null) {
                    return this.takeOptionList_.get(index);
                }
                return this.takeOptionListBuilder_.getMessage(index);
            }
            
            public Builder setTakeOptionList(final int index, final BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption value) {
                if (this.takeOptionListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTakeOptionListIsMutable();
                    this.takeOptionList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.takeOptionListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setTakeOptionList(final int index, final BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder builderForValue) {
                if (this.takeOptionListBuilder_ == null) {
                    this.ensureTakeOptionListIsMutable();
                    this.takeOptionList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.takeOptionListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addTakeOptionList(final BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption value) {
                if (this.takeOptionListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTakeOptionListIsMutable();
                    this.takeOptionList_.add(value);
                    this.onChanged();
                }
                else {
                    this.takeOptionListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addTakeOptionList(final int index, final BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption value) {
                if (this.takeOptionListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureTakeOptionListIsMutable();
                    this.takeOptionList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.takeOptionListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addTakeOptionList(final BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder builderForValue) {
                if (this.takeOptionListBuilder_ == null) {
                    this.ensureTakeOptionListIsMutable();
                    this.takeOptionList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.takeOptionListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addTakeOptionList(final int index, final BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder builderForValue) {
                if (this.takeOptionListBuilder_ == null) {
                    this.ensureTakeOptionListIsMutable();
                    this.takeOptionList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.takeOptionListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllTakeOptionList(final Iterable<? extends BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption> values) {
                if (this.takeOptionListBuilder_ == null) {
                    this.ensureTakeOptionListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.takeOptionList_);
                    this.onChanged();
                }
                else {
                    this.takeOptionListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearTakeOptionList() {
                if (this.takeOptionListBuilder_ == null) {
                    this.takeOptionList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                    this.onChanged();
                }
                else {
                    this.takeOptionListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeTakeOptionList(final int index) {
                if (this.takeOptionListBuilder_ == null) {
                    this.ensureTakeOptionListIsMutable();
                    this.takeOptionList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.takeOptionListBuilder_.remove(index);
                }
                return this;
            }
            
            public BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder getTakeOptionListBuilder(final int index) {
                return this.getTakeOptionListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder getTakeOptionListOrBuilder(final int index) {
                if (this.takeOptionListBuilder_ == null) {
                    return this.takeOptionList_.get(index);
                }
                return this.takeOptionListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder> getTakeOptionListOrBuilderList() {
                if (this.takeOptionListBuilder_ != null) {
                    return this.takeOptionListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder>)this.takeOptionList_);
            }
            
            public BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder addTakeOptionListBuilder() {
                return this.getTakeOptionListFieldBuilder().addBuilder(BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.getDefaultInstance());
            }
            
            public BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder addTakeOptionListBuilder(final int index) {
                return this.getTakeOptionListFieldBuilder().addBuilder(index, BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.getDefaultInstance());
            }
            
            public List<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder> getTakeOptionListBuilderList() {
                return this.getTakeOptionListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption, BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder, BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder> getTakeOptionListFieldBuilder() {
                if (this.takeOptionListBuilder_ == null) {
                    this.takeOptionListBuilder_ = new RepeatedFieldBuilderV3<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption, BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption.Builder, BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder>(this.takeOptionList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
                    this.takeOptionList_ = null;
                }
                return this.takeOptionListBuilder_;
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
    
    public interface TakeBattlePassRewardRspOrBuilder extends MessageOrBuilder
    {
        List<ItemParamOuterClass.ItemParam> getItemListList();
        
        ItemParamOuterClass.ItemParam getItemList(final int p0);
        
        int getItemListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getItemListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(final int p0);
        
        int getRetcode();
        
        List<BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption> getTakeOptionListList();
        
        BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOption getTakeOptionList(final int p0);
        
        int getTakeOptionListCount();
        
        List<? extends BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder> getTakeOptionListOrBuilderList();
        
        BattlePassRewardTakeOptionOuterClass.BattlePassRewardTakeOptionOrBuilder getTakeOptionListOrBuilder(final int p0);
    }
}
