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

public final class PlayerCookRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerCookRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerCookRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerCookRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerCookRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013PlayerCookRsp.proto\u001a\u0014CookRecipeData.proto\u001a\u000fItemParam.proto\"´\u0001\n\rPlayerCookRsp\u0012$\n\u0010extral_item_list\u0018\u000f \u0003(\u000b2\n.ItemParam\u0012\u0012\n\ncook_count\u0018\f \u0001(\r\u0012\u001d\n\titem_list\u0018\u000b \u0003(\u000b2\n.ItemParam\u0012\u000f\n\u0007retcode\u0018\u0003 \u0001(\u0005\u0012\u0013\n\u000bqte_quality\u0018\u0005 \u0001(\r\u0012$\n\u000brecipe_data\u0018\u0007 \u0001(\u000b2\u000f.CookRecipeDataB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerCookRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { CookRecipeDataOuterClass.getDescriptor(), ItemParamOuterClass.getDescriptor() });
        internal_static_PlayerCookRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerCookRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerCookRspOuterClass.internal_static_PlayerCookRsp_descriptor, new String[] { "ExtralItemList", "CookCount", "ItemList", "Retcode", "QteQuality", "RecipeData" });
        CookRecipeDataOuterClass.getDescriptor();
        ItemParamOuterClass.getDescriptor();
    }
    
    public static final class PlayerCookRsp extends GeneratedMessageV3 implements PlayerCookRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int EXTRAL_ITEM_LIST_FIELD_NUMBER = 15;
        private List<ItemParamOuterClass.ItemParam> extralItemList_;
        public static final int COOK_COUNT_FIELD_NUMBER = 12;
        private int cookCount_;
        public static final int ITEM_LIST_FIELD_NUMBER = 11;
        private List<ItemParamOuterClass.ItemParam> itemList_;
        public static final int RETCODE_FIELD_NUMBER = 3;
        private int retcode_;
        public static final int QTE_QUALITY_FIELD_NUMBER = 5;
        private int qteQuality_;
        public static final int RECIPE_DATA_FIELD_NUMBER = 7;
        private CookRecipeDataOuterClass.CookRecipeData recipeData_;
        private byte memoizedIsInitialized;
        private static final PlayerCookRsp DEFAULT_INSTANCE;
        private static final Parser<PlayerCookRsp> PARSER;
        
        private PlayerCookRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerCookRsp() {
            this.memoizedIsInitialized = -1;
            this.extralItemList_ = Collections.emptyList();
            this.itemList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerCookRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerCookRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 40: {
                            this.qteQuality_ = input.readUInt32();
                            continue;
                        }
                        case 58: {
                            CookRecipeDataOuterClass.CookRecipeData.Builder subBuilder = null;
                            if (this.recipeData_ != null) {
                                subBuilder = this.recipeData_.toBuilder();
                            }
                            this.recipeData_ = input.readMessage(CookRecipeDataOuterClass.CookRecipeData.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.recipeData_);
                                this.recipeData_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 90: {
                            if ((mutable_bitField0_ & 0x2) == 0x0) {
                                this.itemList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x2;
                            }
                            this.itemList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
                            continue;
                        }
                        case 96: {
                            this.cookCount_ = input.readUInt32();
                            continue;
                        }
                        case 122: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.extralItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.extralItemList_.add(input.readMessage(ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
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
                    this.itemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.itemList_);
                }
                if ((mutable_bitField0_ & 0x1) != 0x0) {
                    this.extralItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.extralItemList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return PlayerCookRspOuterClass.internal_static_PlayerCookRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerCookRspOuterClass.internal_static_PlayerCookRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerCookRsp.class, Builder.class);
        }
        
        @Override
        public List<ItemParamOuterClass.ItemParam> getExtralItemListList() {
            return this.extralItemList_;
        }
        
        @Override
        public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getExtralItemListOrBuilderList() {
            return this.extralItemList_;
        }
        
        @Override
        public int getExtralItemListCount() {
            return this.extralItemList_.size();
        }
        
        @Override
        public ItemParamOuterClass.ItemParam getExtralItemList(final int index) {
            return this.extralItemList_.get(index);
        }
        
        @Override
        public ItemParamOuterClass.ItemParamOrBuilder getExtralItemListOrBuilder(final int index) {
            return this.extralItemList_.get(index);
        }
        
        @Override
        public int getCookCount() {
            return this.cookCount_;
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
        public int getQteQuality() {
            return this.qteQuality_;
        }
        
        @Override
        public boolean hasRecipeData() {
            return this.recipeData_ != null;
        }
        
        @Override
        public CookRecipeDataOuterClass.CookRecipeData getRecipeData() {
            return (this.recipeData_ == null) ? CookRecipeDataOuterClass.CookRecipeData.getDefaultInstance() : this.recipeData_;
        }
        
        @Override
        public CookRecipeDataOuterClass.CookRecipeDataOrBuilder getRecipeDataOrBuilder() {
            return this.getRecipeData();
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
            if (this.retcode_ != 0) {
                output.writeInt32(3, this.retcode_);
            }
            if (this.qteQuality_ != 0) {
                output.writeUInt32(5, this.qteQuality_);
            }
            if (this.recipeData_ != null) {
                output.writeMessage(7, this.getRecipeData());
            }
            for (int i = 0; i < this.itemList_.size(); ++i) {
                output.writeMessage(11, this.itemList_.get(i));
            }
            if (this.cookCount_ != 0) {
                output.writeUInt32(12, this.cookCount_);
            }
            for (int i = 0; i < this.extralItemList_.size(); ++i) {
                output.writeMessage(15, this.extralItemList_.get(i));
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
            if (this.qteQuality_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.qteQuality_);
            }
            if (this.recipeData_ != null) {
                size += CodedOutputStream.computeMessageSize(7, this.getRecipeData());
            }
            for (int i = 0; i < this.itemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(11, this.itemList_.get(i));
            }
            if (this.cookCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(12, this.cookCount_);
            }
            for (int i = 0; i < this.extralItemList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(15, this.extralItemList_.get(i));
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerCookRsp)) {
                return super.equals(obj);
            }
            final PlayerCookRsp other = (PlayerCookRsp)obj;
            return this.getExtralItemListList().equals(other.getExtralItemListList()) && this.getCookCount() == other.getCookCount() && this.getItemListList().equals(other.getItemListList()) && this.getRetcode() == other.getRetcode() && this.getQteQuality() == other.getQteQuality() && this.hasRecipeData() == other.hasRecipeData() && (!this.hasRecipeData() || this.getRecipeData().equals(other.getRecipeData())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            if (this.getExtralItemListCount() > 0) {
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getExtralItemListList().hashCode();
            }
            hash = 37 * hash + 12;
            hash = 53 * hash + this.getCookCount();
            if (this.getItemListCount() > 0) {
                hash = 37 * hash + 11;
                hash = 53 * hash + this.getItemListList().hashCode();
            }
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getQteQuality();
            if (this.hasRecipeData()) {
                hash = 37 * hash + 7;
                hash = 53 * hash + this.getRecipeData().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerCookRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerCookRsp.PARSER.parseFrom(data);
        }
        
        public static PlayerCookRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerCookRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerCookRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerCookRsp.PARSER.parseFrom(data);
        }
        
        public static PlayerCookRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerCookRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerCookRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerCookRsp.PARSER.parseFrom(data);
        }
        
        public static PlayerCookRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerCookRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerCookRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerCookRsp.PARSER, input);
        }
        
        public static PlayerCookRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerCookRsp.PARSER, input, extensionRegistry);
        }
        
        public static PlayerCookRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerCookRsp.PARSER, input);
        }
        
        public static PlayerCookRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerCookRsp.PARSER, input, extensionRegistry);
        }
        
        public static PlayerCookRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerCookRsp.PARSER, input);
        }
        
        public static PlayerCookRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerCookRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerCookRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerCookRsp prototype) {
            return PlayerCookRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerCookRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerCookRsp getDefaultInstance() {
            return PlayerCookRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerCookRsp> parser() {
            return PlayerCookRsp.PARSER;
        }
        
        @Override
        public Parser<PlayerCookRsp> getParserForType() {
            return PlayerCookRsp.PARSER;
        }
        
        @Override
        public PlayerCookRsp getDefaultInstanceForType() {
            return PlayerCookRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerCookRsp();
            PARSER = new AbstractParser<PlayerCookRsp>() {
                @Override
                public PlayerCookRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerCookRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerCookRspOrBuilder
        {
            private int bitField0_;
            private List<ItemParamOuterClass.ItemParam> extralItemList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> extralItemListBuilder_;
            private int cookCount_;
            private List<ItemParamOuterClass.ItemParam> itemList_;
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> itemListBuilder_;
            private int retcode_;
            private int qteQuality_;
            private CookRecipeDataOuterClass.CookRecipeData recipeData_;
            private SingleFieldBuilderV3<CookRecipeDataOuterClass.CookRecipeData, CookRecipeDataOuterClass.CookRecipeData.Builder, CookRecipeDataOuterClass.CookRecipeDataOrBuilder> recipeDataBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerCookRspOuterClass.internal_static_PlayerCookRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerCookRspOuterClass.internal_static_PlayerCookRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerCookRsp.class, Builder.class);
            }
            
            private Builder() {
                this.extralItemList_ = Collections.emptyList();
                this.itemList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.extralItemList_ = Collections.emptyList();
                this.itemList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerCookRsp.alwaysUseFieldBuilders) {
                    this.getExtralItemListFieldBuilder();
                    this.getItemListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                if (this.extralItemListBuilder_ == null) {
                    this.extralItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.extralItemListBuilder_.clear();
                }
                this.cookCount_ = 0;
                if (this.itemListBuilder_ == null) {
                    this.itemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFD;
                }
                else {
                    this.itemListBuilder_.clear();
                }
                this.retcode_ = 0;
                this.qteQuality_ = 0;
                if (this.recipeDataBuilder_ == null) {
                    this.recipeData_ = null;
                }
                else {
                    this.recipeData_ = null;
                    this.recipeDataBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerCookRspOuterClass.internal_static_PlayerCookRsp_descriptor;
            }
            
            @Override
            public PlayerCookRsp getDefaultInstanceForType() {
                return PlayerCookRsp.getDefaultInstance();
            }
            
            @Override
            public PlayerCookRsp build() {
                final PlayerCookRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerCookRsp buildPartial() {
                final PlayerCookRsp result = new PlayerCookRsp(this);
                final int from_bitField0_ = this.bitField0_;
                if (this.extralItemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.extralItemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.extralItemList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.extralItemList_ = this.extralItemList_;
                }
                else {
                    result.extralItemList_ = this.extralItemListBuilder_.build();
                }
                result.cookCount_ = this.cookCount_;
                if (this.itemListBuilder_ == null) {
                    if ((this.bitField0_ & 0x2) != 0x0) {
                        this.itemList_ = Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.itemList_);
                        this.bitField0_ &= 0xFFFFFFFD;
                    }
                    result.itemList_ = this.itemList_;
                }
                else {
                    result.itemList_ = this.itemListBuilder_.build();
                }
                result.retcode_ = this.retcode_;
                result.qteQuality_ = this.qteQuality_;
                if (this.recipeDataBuilder_ == null) {
                    result.recipeData_ = this.recipeData_;
                }
                else {
                    result.recipeData_ = this.recipeDataBuilder_.build();
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
                if (other instanceof PlayerCookRsp) {
                    return this.mergeFrom((PlayerCookRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerCookRsp other) {
                if (other == PlayerCookRsp.getDefaultInstance()) {
                    return this;
                }
                if (this.extralItemListBuilder_ == null) {
                    if (!other.extralItemList_.isEmpty()) {
                        if (this.extralItemList_.isEmpty()) {
                            this.extralItemList_ = other.extralItemList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureExtralItemListIsMutable();
                            this.extralItemList_.addAll(other.extralItemList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.extralItemList_.isEmpty()) {
                    if (this.extralItemListBuilder_.isEmpty()) {
                        this.extralItemListBuilder_.dispose();
                        this.extralItemListBuilder_ = null;
                        this.extralItemList_ = other.extralItemList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.extralItemListBuilder_ = (PlayerCookRsp.alwaysUseFieldBuilders ? this.getExtralItemListFieldBuilder() : null);
                    }
                    else {
                        this.extralItemListBuilder_.addAllMessages(other.extralItemList_);
                    }
                }
                if (other.getCookCount() != 0) {
                    this.setCookCount(other.getCookCount());
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
                        this.itemListBuilder_ = (PlayerCookRsp.alwaysUseFieldBuilders ? this.getItemListFieldBuilder() : null);
                    }
                    else {
                        this.itemListBuilder_.addAllMessages(other.itemList_);
                    }
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getQteQuality() != 0) {
                    this.setQteQuality(other.getQteQuality());
                }
                if (other.hasRecipeData()) {
                    this.mergeRecipeData(other.getRecipeData());
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
                PlayerCookRsp parsedMessage = null;
                try {
                    parsedMessage = PlayerCookRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerCookRsp)e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                }
                finally {
                    if (parsedMessage != null) {
                        this.mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            
            private void ensureExtralItemListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.extralItemList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.extralItemList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ItemParamOuterClass.ItemParam> getExtralItemListList() {
                if (this.extralItemListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParam>)this.extralItemList_);
                }
                return this.extralItemListBuilder_.getMessageList();
            }
            
            @Override
            public int getExtralItemListCount() {
                if (this.extralItemListBuilder_ == null) {
                    return this.extralItemList_.size();
                }
                return this.extralItemListBuilder_.getCount();
            }
            
            @Override
            public ItemParamOuterClass.ItemParam getExtralItemList(final int index) {
                if (this.extralItemListBuilder_ == null) {
                    return this.extralItemList_.get(index);
                }
                return this.extralItemListBuilder_.getMessage(index);
            }
            
            public Builder setExtralItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.extralItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureExtralItemListIsMutable();
                    this.extralItemList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.extralItemListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setExtralItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.extralItemListBuilder_ == null) {
                    this.ensureExtralItemListIsMutable();
                    this.extralItemList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.extralItemListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addExtralItemList(final ItemParamOuterClass.ItemParam value) {
                if (this.extralItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureExtralItemListIsMutable();
                    this.extralItemList_.add(value);
                    this.onChanged();
                }
                else {
                    this.extralItemListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addExtralItemList(final int index, final ItemParamOuterClass.ItemParam value) {
                if (this.extralItemListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureExtralItemListIsMutable();
                    this.extralItemList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.extralItemListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addExtralItemList(final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.extralItemListBuilder_ == null) {
                    this.ensureExtralItemListIsMutable();
                    this.extralItemList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.extralItemListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addExtralItemList(final int index, final ItemParamOuterClass.ItemParam.Builder builderForValue) {
                if (this.extralItemListBuilder_ == null) {
                    this.ensureExtralItemListIsMutable();
                    this.extralItemList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.extralItemListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllExtralItemList(final Iterable<? extends ItemParamOuterClass.ItemParam> values) {
                if (this.extralItemListBuilder_ == null) {
                    this.ensureExtralItemListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.extralItemList_);
                    this.onChanged();
                }
                else {
                    this.extralItemListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearExtralItemList() {
                if (this.extralItemListBuilder_ == null) {
                    this.extralItemList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.extralItemListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeExtralItemList(final int index) {
                if (this.extralItemListBuilder_ == null) {
                    this.ensureExtralItemListIsMutable();
                    this.extralItemList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.extralItemListBuilder_.remove(index);
                }
                return this;
            }
            
            public ItemParamOuterClass.ItemParam.Builder getExtralItemListBuilder(final int index) {
                return this.getExtralItemListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ItemParamOuterClass.ItemParamOrBuilder getExtralItemListOrBuilder(final int index) {
                if (this.extralItemListBuilder_ == null) {
                    return this.extralItemList_.get(index);
                }
                return this.extralItemListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ItemParamOuterClass.ItemParamOrBuilder> getExtralItemListOrBuilderList() {
                if (this.extralItemListBuilder_ != null) {
                    return this.extralItemListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ItemParamOuterClass.ItemParamOrBuilder>)this.extralItemList_);
            }
            
            public ItemParamOuterClass.ItemParam.Builder addExtralItemListBuilder() {
                return this.getExtralItemListFieldBuilder().addBuilder(ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public ItemParamOuterClass.ItemParam.Builder addExtralItemListBuilder(final int index) {
                return this.getExtralItemListFieldBuilder().addBuilder(index, ItemParamOuterClass.ItemParam.getDefaultInstance());
            }
            
            public List<ItemParamOuterClass.ItemParam.Builder> getExtralItemListBuilderList() {
                return this.getExtralItemListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder> getExtralItemListFieldBuilder() {
                if (this.extralItemListBuilder_ == null) {
                    this.extralItemListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.extralItemList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.extralItemList_ = null;
                }
                return this.extralItemListBuilder_;
            }
            
            @Override
            public int getCookCount() {
                return this.cookCount_;
            }
            
            public Builder setCookCount(final int value) {
                this.cookCount_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCookCount() {
                this.cookCount_ = 0;
                this.onChanged();
                return this;
            }
            
            private void ensureItemListIsMutable() {
                if ((this.bitField0_ & 0x2) == 0x0) {
                    this.itemList_ = new ArrayList<ItemParamOuterClass.ItemParam>(this.itemList_);
                    this.bitField0_ |= 0x2;
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
                    this.itemListBuilder_ = new RepeatedFieldBuilderV3<ItemParamOuterClass.ItemParam, ItemParamOuterClass.ItemParam.Builder, ItemParamOuterClass.ItemParamOrBuilder>(this.itemList_, (this.bitField0_ & 0x2) != 0x0, this.getParentForChildren(), this.isClean());
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
            
            @Override
            public int getQteQuality() {
                return this.qteQuality_;
            }
            
            public Builder setQteQuality(final int value) {
                this.qteQuality_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearQteQuality() {
                this.qteQuality_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasRecipeData() {
                return this.recipeDataBuilder_ != null || this.recipeData_ != null;
            }
            
            @Override
            public CookRecipeDataOuterClass.CookRecipeData getRecipeData() {
                if (this.recipeDataBuilder_ == null) {
                    return (this.recipeData_ == null) ? CookRecipeDataOuterClass.CookRecipeData.getDefaultInstance() : this.recipeData_;
                }
                return this.recipeDataBuilder_.getMessage();
            }
            
            public Builder setRecipeData(final CookRecipeDataOuterClass.CookRecipeData value) {
                if (this.recipeDataBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.recipeData_ = value;
                    this.onChanged();
                }
                else {
                    this.recipeDataBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setRecipeData(final CookRecipeDataOuterClass.CookRecipeData.Builder builderForValue) {
                if (this.recipeDataBuilder_ == null) {
                    this.recipeData_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.recipeDataBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeRecipeData(final CookRecipeDataOuterClass.CookRecipeData value) {
                if (this.recipeDataBuilder_ == null) {
                    if (this.recipeData_ != null) {
                        this.recipeData_ = CookRecipeDataOuterClass.CookRecipeData.newBuilder(this.recipeData_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.recipeData_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.recipeDataBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearRecipeData() {
                if (this.recipeDataBuilder_ == null) {
                    this.recipeData_ = null;
                    this.onChanged();
                }
                else {
                    this.recipeData_ = null;
                    this.recipeDataBuilder_ = null;
                }
                return this;
            }
            
            public CookRecipeDataOuterClass.CookRecipeData.Builder getRecipeDataBuilder() {
                this.onChanged();
                return this.getRecipeDataFieldBuilder().getBuilder();
            }
            
            @Override
            public CookRecipeDataOuterClass.CookRecipeDataOrBuilder getRecipeDataOrBuilder() {
                if (this.recipeDataBuilder_ != null) {
                    return this.recipeDataBuilder_.getMessageOrBuilder();
                }
                return (this.recipeData_ == null) ? CookRecipeDataOuterClass.CookRecipeData.getDefaultInstance() : this.recipeData_;
            }
            
            private SingleFieldBuilderV3<CookRecipeDataOuterClass.CookRecipeData, CookRecipeDataOuterClass.CookRecipeData.Builder, CookRecipeDataOuterClass.CookRecipeDataOrBuilder> getRecipeDataFieldBuilder() {
                if (this.recipeDataBuilder_ == null) {
                    this.recipeDataBuilder_ = new SingleFieldBuilderV3<CookRecipeDataOuterClass.CookRecipeData, CookRecipeDataOuterClass.CookRecipeData.Builder, CookRecipeDataOuterClass.CookRecipeDataOrBuilder>(this.getRecipeData(), this.getParentForChildren(), this.isClean());
                    this.recipeData_ = null;
                }
                return this.recipeDataBuilder_;
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
    
    public interface PlayerCookRspOrBuilder extends MessageOrBuilder
    {
        List<ItemParamOuterClass.ItemParam> getExtralItemListList();
        
        ItemParamOuterClass.ItemParam getExtralItemList(final int p0);
        
        int getExtralItemListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getExtralItemListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getExtralItemListOrBuilder(final int p0);
        
        int getCookCount();
        
        List<ItemParamOuterClass.ItemParam> getItemListList();
        
        ItemParamOuterClass.ItemParam getItemList(final int p0);
        
        int getItemListCount();
        
        List<? extends ItemParamOuterClass.ItemParamOrBuilder> getItemListOrBuilderList();
        
        ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(final int p0);
        
        int getRetcode();
        
        int getQteQuality();
        
        boolean hasRecipeData();
        
        CookRecipeDataOuterClass.CookRecipeData getRecipeData();
        
        CookRecipeDataOuterClass.CookRecipeDataOrBuilder getRecipeDataOrBuilder();
    }
}
