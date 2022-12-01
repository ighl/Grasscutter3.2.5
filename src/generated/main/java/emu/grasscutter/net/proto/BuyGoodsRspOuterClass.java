// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import java.util.Collection;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
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

public final class BuyGoodsRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_BuyGoodsRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BuyGoodsRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private BuyGoodsRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BuyGoodsRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0011BuyGoodsRsp.proto\u001a\u000fShopGoods.proto\"\u007f\n\u000bBuyGoodsRsp\u0012\u0011\n\tbuy_count\u0018\u000e \u0001(\r\u0012\u0019\n\u0005goods\u0018\f \u0001(\u000b2\n.ShopGoods\u0012\u0011\n\tshop_type\u0018\u000b \u0001(\r\u0012\u000f\n\u0007retcode\u0018\u0002 \u0001(\u0005\u0012\u001e\n\ngoods_list\u0018\u0005 \u0003(\u000b2\n.ShopGoodsB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BuyGoodsRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ShopGoodsOuterClass.getDescriptor() });
        internal_static_BuyGoodsRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BuyGoodsRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BuyGoodsRspOuterClass.internal_static_BuyGoodsRsp_descriptor, new String[] { "BuyCount", "Goods", "ShopType", "Retcode", "GoodsList" });
        ShopGoodsOuterClass.getDescriptor();
    }
    
    public static final class BuyGoodsRsp extends GeneratedMessageV3 implements BuyGoodsRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int BUY_COUNT_FIELD_NUMBER = 14;
        private int buyCount_;
        public static final int GOODS_FIELD_NUMBER = 12;
        private ShopGoodsOuterClass.ShopGoods goods_;
        public static final int SHOP_TYPE_FIELD_NUMBER = 11;
        private int shopType_;
        public static final int RETCODE_FIELD_NUMBER = 2;
        private int retcode_;
        public static final int GOODS_LIST_FIELD_NUMBER = 5;
        private List<ShopGoodsOuterClass.ShopGoods> goodsList_;
        private byte memoizedIsInitialized;
        private static final BuyGoodsRsp DEFAULT_INSTANCE;
        private static final Parser<BuyGoodsRsp> PARSER;
        
        private BuyGoodsRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private BuyGoodsRsp() {
            this.memoizedIsInitialized = -1;
            this.goodsList_ = Collections.emptyList();
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new BuyGoodsRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private BuyGoodsRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 42: {
                            if ((mutable_bitField0_ & 0x1) == 0x0) {
                                this.goodsList_ = new ArrayList<ShopGoodsOuterClass.ShopGoods>();
                                mutable_bitField0_ |= 0x1;
                            }
                            this.goodsList_.add(input.readMessage(ShopGoodsOuterClass.ShopGoods.parser(), extensionRegistry));
                            continue;
                        }
                        case 88: {
                            this.shopType_ = input.readUInt32();
                            continue;
                        }
                        case 98: {
                            ShopGoodsOuterClass.ShopGoods.Builder subBuilder = null;
                            if (this.goods_ != null) {
                                subBuilder = this.goods_.toBuilder();
                            }
                            this.goods_ = input.readMessage(ShopGoodsOuterClass.ShopGoods.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.goods_);
                                this.goods_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 112: {
                            this.buyCount_ = input.readUInt32();
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
                    this.goodsList_ = Collections.unmodifiableList((List<? extends ShopGoodsOuterClass.ShopGoods>)this.goodsList_);
                }
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return BuyGoodsRspOuterClass.internal_static_BuyGoodsRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return BuyGoodsRspOuterClass.internal_static_BuyGoodsRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(BuyGoodsRsp.class, Builder.class);
        }
        
        @Override
        public int getBuyCount() {
            return this.buyCount_;
        }
        
        @Override
        public boolean hasGoods() {
            return this.goods_ != null;
        }
        
        @Override
        public ShopGoodsOuterClass.ShopGoods getGoods() {
            return (this.goods_ == null) ? ShopGoodsOuterClass.ShopGoods.getDefaultInstance() : this.goods_;
        }
        
        @Override
        public ShopGoodsOuterClass.ShopGoodsOrBuilder getGoodsOrBuilder() {
            return this.getGoods();
        }
        
        @Override
        public int getShopType() {
            return this.shopType_;
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public List<ShopGoodsOuterClass.ShopGoods> getGoodsListList() {
            return this.goodsList_;
        }
        
        @Override
        public List<? extends ShopGoodsOuterClass.ShopGoodsOrBuilder> getGoodsListOrBuilderList() {
            return this.goodsList_;
        }
        
        @Override
        public int getGoodsListCount() {
            return this.goodsList_.size();
        }
        
        @Override
        public ShopGoodsOuterClass.ShopGoods getGoodsList(final int index) {
            return this.goodsList_.get(index);
        }
        
        @Override
        public ShopGoodsOuterClass.ShopGoodsOrBuilder getGoodsListOrBuilder(final int index) {
            return this.goodsList_.get(index);
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
                output.writeInt32(2, this.retcode_);
            }
            for (int i = 0; i < this.goodsList_.size(); ++i) {
                output.writeMessage(5, this.goodsList_.get(i));
            }
            if (this.shopType_ != 0) {
                output.writeUInt32(11, this.shopType_);
            }
            if (this.goods_ != null) {
                output.writeMessage(12, this.getGoods());
            }
            if (this.buyCount_ != 0) {
                output.writeUInt32(14, this.buyCount_);
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
                size += CodedOutputStream.computeInt32Size(2, this.retcode_);
            }
            for (int i = 0; i < this.goodsList_.size(); ++i) {
                size += CodedOutputStream.computeMessageSize(5, this.goodsList_.get(i));
            }
            if (this.shopType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.shopType_);
            }
            if (this.goods_ != null) {
                size += CodedOutputStream.computeMessageSize(12, this.getGoods());
            }
            if (this.buyCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.buyCount_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BuyGoodsRsp)) {
                return super.equals(obj);
            }
            final BuyGoodsRsp other = (BuyGoodsRsp)obj;
            return this.getBuyCount() == other.getBuyCount() && this.hasGoods() == other.hasGoods() && (!this.hasGoods() || this.getGoods().equals(other.getGoods())) && this.getShopType() == other.getShopType() && this.getRetcode() == other.getRetcode() && this.getGoodsListList().equals(other.getGoodsListList()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getBuyCount();
            if (this.hasGoods()) {
                hash = 37 * hash + 12;
                hash = 53 * hash + this.getGoods().hashCode();
            }
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getShopType();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getRetcode();
            if (this.getGoodsListCount() > 0) {
                hash = 37 * hash + 5;
                hash = 53 * hash + this.getGoodsListList().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static BuyGoodsRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return BuyGoodsRsp.PARSER.parseFrom(data);
        }
        
        public static BuyGoodsRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BuyGoodsRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BuyGoodsRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return BuyGoodsRsp.PARSER.parseFrom(data);
        }
        
        public static BuyGoodsRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BuyGoodsRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BuyGoodsRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return BuyGoodsRsp.PARSER.parseFrom(data);
        }
        
        public static BuyGoodsRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BuyGoodsRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BuyGoodsRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BuyGoodsRsp.PARSER, input);
        }
        
        public static BuyGoodsRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BuyGoodsRsp.PARSER, input, extensionRegistry);
        }
        
        public static BuyGoodsRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BuyGoodsRsp.PARSER, input);
        }
        
        public static BuyGoodsRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BuyGoodsRsp.PARSER, input, extensionRegistry);
        }
        
        public static BuyGoodsRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BuyGoodsRsp.PARSER, input);
        }
        
        public static BuyGoodsRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BuyGoodsRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return BuyGoodsRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final BuyGoodsRsp prototype) {
            return BuyGoodsRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == BuyGoodsRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static BuyGoodsRsp getDefaultInstance() {
            return BuyGoodsRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<BuyGoodsRsp> parser() {
            return BuyGoodsRsp.PARSER;
        }
        
        @Override
        public Parser<BuyGoodsRsp> getParserForType() {
            return BuyGoodsRsp.PARSER;
        }
        
        @Override
        public BuyGoodsRsp getDefaultInstanceForType() {
            return BuyGoodsRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new BuyGoodsRsp();
            PARSER = new AbstractParser<BuyGoodsRsp>() {
                @Override
                public BuyGoodsRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new BuyGoodsRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BuyGoodsRspOrBuilder
        {
            private int bitField0_;
            private int buyCount_;
            private ShopGoodsOuterClass.ShopGoods goods_;
            private SingleFieldBuilderV3<ShopGoodsOuterClass.ShopGoods, ShopGoodsOuterClass.ShopGoods.Builder, ShopGoodsOuterClass.ShopGoodsOrBuilder> goodsBuilder_;
            private int shopType_;
            private int retcode_;
            private List<ShopGoodsOuterClass.ShopGoods> goodsList_;
            private RepeatedFieldBuilderV3<ShopGoodsOuterClass.ShopGoods, ShopGoodsOuterClass.ShopGoods.Builder, ShopGoodsOuterClass.ShopGoodsOrBuilder> goodsListBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return BuyGoodsRspOuterClass.internal_static_BuyGoodsRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return BuyGoodsRspOuterClass.internal_static_BuyGoodsRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(BuyGoodsRsp.class, Builder.class);
            }
            
            private Builder() {
                this.goodsList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.goodsList_ = Collections.emptyList();
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (BuyGoodsRsp.alwaysUseFieldBuilders) {
                    this.getGoodsListFieldBuilder();
                }
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.buyCount_ = 0;
                if (this.goodsBuilder_ == null) {
                    this.goods_ = null;
                }
                else {
                    this.goods_ = null;
                    this.goodsBuilder_ = null;
                }
                this.shopType_ = 0;
                this.retcode_ = 0;
                if (this.goodsListBuilder_ == null) {
                    this.goodsList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                }
                else {
                    this.goodsListBuilder_.clear();
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return BuyGoodsRspOuterClass.internal_static_BuyGoodsRsp_descriptor;
            }
            
            @Override
            public BuyGoodsRsp getDefaultInstanceForType() {
                return BuyGoodsRsp.getDefaultInstance();
            }
            
            @Override
            public BuyGoodsRsp build() {
                final BuyGoodsRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public BuyGoodsRsp buildPartial() {
                final BuyGoodsRsp result = new BuyGoodsRsp(this);
                final int from_bitField0_ = this.bitField0_;
                result.buyCount_ = this.buyCount_;
                if (this.goodsBuilder_ == null) {
                    result.goods_ = this.goods_;
                }
                else {
                    result.goods_ = this.goodsBuilder_.build();
                }
                result.shopType_ = this.shopType_;
                result.retcode_ = this.retcode_;
                if (this.goodsListBuilder_ == null) {
                    if ((this.bitField0_ & 0x1) != 0x0) {
                        this.goodsList_ = Collections.unmodifiableList((List<? extends ShopGoodsOuterClass.ShopGoods>)this.goodsList_);
                        this.bitField0_ &= 0xFFFFFFFE;
                    }
                    result.goodsList_ = this.goodsList_;
                }
                else {
                    result.goodsList_ = this.goodsListBuilder_.build();
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
                if (other instanceof BuyGoodsRsp) {
                    return this.mergeFrom((BuyGoodsRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final BuyGoodsRsp other) {
                if (other == BuyGoodsRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getBuyCount() != 0) {
                    this.setBuyCount(other.getBuyCount());
                }
                if (other.hasGoods()) {
                    this.mergeGoods(other.getGoods());
                }
                if (other.getShopType() != 0) {
                    this.setShopType(other.getShopType());
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (this.goodsListBuilder_ == null) {
                    if (!other.goodsList_.isEmpty()) {
                        if (this.goodsList_.isEmpty()) {
                            this.goodsList_ = other.goodsList_;
                            this.bitField0_ &= 0xFFFFFFFE;
                        }
                        else {
                            this.ensureGoodsListIsMutable();
                            this.goodsList_.addAll(other.goodsList_);
                        }
                        this.onChanged();
                    }
                }
                else if (!other.goodsList_.isEmpty()) {
                    if (this.goodsListBuilder_.isEmpty()) {
                        this.goodsListBuilder_.dispose();
                        this.goodsListBuilder_ = null;
                        this.goodsList_ = other.goodsList_;
                        this.bitField0_ &= 0xFFFFFFFE;
                        this.goodsListBuilder_ = (BuyGoodsRsp.alwaysUseFieldBuilders ? this.getGoodsListFieldBuilder() : null);
                    }
                    else {
                        this.goodsListBuilder_.addAllMessages(other.goodsList_);
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
                BuyGoodsRsp parsedMessage = null;
                try {
                    parsedMessage = BuyGoodsRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (BuyGoodsRsp)e.getUnfinishedMessage();
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
            public int getBuyCount() {
                return this.buyCount_;
            }
            
            public Builder setBuyCount(final int value) {
                this.buyCount_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBuyCount() {
                this.buyCount_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasGoods() {
                return this.goodsBuilder_ != null || this.goods_ != null;
            }
            
            @Override
            public ShopGoodsOuterClass.ShopGoods getGoods() {
                if (this.goodsBuilder_ == null) {
                    return (this.goods_ == null) ? ShopGoodsOuterClass.ShopGoods.getDefaultInstance() : this.goods_;
                }
                return this.goodsBuilder_.getMessage();
            }
            
            public Builder setGoods(final ShopGoodsOuterClass.ShopGoods value) {
                if (this.goodsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.goods_ = value;
                    this.onChanged();
                }
                else {
                    this.goodsBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setGoods(final ShopGoodsOuterClass.ShopGoods.Builder builderForValue) {
                if (this.goodsBuilder_ == null) {
                    this.goods_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.goodsBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeGoods(final ShopGoodsOuterClass.ShopGoods value) {
                if (this.goodsBuilder_ == null) {
                    if (this.goods_ != null) {
                        this.goods_ = ShopGoodsOuterClass.ShopGoods.newBuilder(this.goods_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.goods_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.goodsBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearGoods() {
                if (this.goodsBuilder_ == null) {
                    this.goods_ = null;
                    this.onChanged();
                }
                else {
                    this.goods_ = null;
                    this.goodsBuilder_ = null;
                }
                return this;
            }
            
            public ShopGoodsOuterClass.ShopGoods.Builder getGoodsBuilder() {
                this.onChanged();
                return this.getGoodsFieldBuilder().getBuilder();
            }
            
            @Override
            public ShopGoodsOuterClass.ShopGoodsOrBuilder getGoodsOrBuilder() {
                if (this.goodsBuilder_ != null) {
                    return this.goodsBuilder_.getMessageOrBuilder();
                }
                return (this.goods_ == null) ? ShopGoodsOuterClass.ShopGoods.getDefaultInstance() : this.goods_;
            }
            
            private SingleFieldBuilderV3<ShopGoodsOuterClass.ShopGoods, ShopGoodsOuterClass.ShopGoods.Builder, ShopGoodsOuterClass.ShopGoodsOrBuilder> getGoodsFieldBuilder() {
                if (this.goodsBuilder_ == null) {
                    this.goodsBuilder_ = new SingleFieldBuilderV3<ShopGoodsOuterClass.ShopGoods, ShopGoodsOuterClass.ShopGoods.Builder, ShopGoodsOuterClass.ShopGoodsOrBuilder>(this.getGoods(), this.getParentForChildren(), this.isClean());
                    this.goods_ = null;
                }
                return this.goodsBuilder_;
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
            
            private void ensureGoodsListIsMutable() {
                if ((this.bitField0_ & 0x1) == 0x0) {
                    this.goodsList_ = new ArrayList<ShopGoodsOuterClass.ShopGoods>(this.goodsList_);
                    this.bitField0_ |= 0x1;
                }
            }
            
            @Override
            public List<ShopGoodsOuterClass.ShopGoods> getGoodsListList() {
                if (this.goodsListBuilder_ == null) {
                    return Collections.unmodifiableList((List<? extends ShopGoodsOuterClass.ShopGoods>)this.goodsList_);
                }
                return this.goodsListBuilder_.getMessageList();
            }
            
            @Override
            public int getGoodsListCount() {
                if (this.goodsListBuilder_ == null) {
                    return this.goodsList_.size();
                }
                return this.goodsListBuilder_.getCount();
            }
            
            @Override
            public ShopGoodsOuterClass.ShopGoods getGoodsList(final int index) {
                if (this.goodsListBuilder_ == null) {
                    return this.goodsList_.get(index);
                }
                return this.goodsListBuilder_.getMessage(index);
            }
            
            public Builder setGoodsList(final int index, final ShopGoodsOuterClass.ShopGoods value) {
                if (this.goodsListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureGoodsListIsMutable();
                    this.goodsList_.set(index, value);
                    this.onChanged();
                }
                else {
                    this.goodsListBuilder_.setMessage(index, value);
                }
                return this;
            }
            
            public Builder setGoodsList(final int index, final ShopGoodsOuterClass.ShopGoods.Builder builderForValue) {
                if (this.goodsListBuilder_ == null) {
                    this.ensureGoodsListIsMutable();
                    this.goodsList_.set(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.goodsListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addGoodsList(final ShopGoodsOuterClass.ShopGoods value) {
                if (this.goodsListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureGoodsListIsMutable();
                    this.goodsList_.add(value);
                    this.onChanged();
                }
                else {
                    this.goodsListBuilder_.addMessage(value);
                }
                return this;
            }
            
            public Builder addGoodsList(final int index, final ShopGoodsOuterClass.ShopGoods value) {
                if (this.goodsListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.ensureGoodsListIsMutable();
                    this.goodsList_.add(index, value);
                    this.onChanged();
                }
                else {
                    this.goodsListBuilder_.addMessage(index, value);
                }
                return this;
            }
            
            public Builder addGoodsList(final ShopGoodsOuterClass.ShopGoods.Builder builderForValue) {
                if (this.goodsListBuilder_ == null) {
                    this.ensureGoodsListIsMutable();
                    this.goodsList_.add(builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.goodsListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder addGoodsList(final int index, final ShopGoodsOuterClass.ShopGoods.Builder builderForValue) {
                if (this.goodsListBuilder_ == null) {
                    this.ensureGoodsListIsMutable();
                    this.goodsList_.add(index, builderForValue.build());
                    this.onChanged();
                }
                else {
                    this.goodsListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            
            public Builder addAllGoodsList(final Iterable<? extends ShopGoodsOuterClass.ShopGoods> values) {
                if (this.goodsListBuilder_ == null) {
                    this.ensureGoodsListIsMutable();
                    AbstractMessageLite.Builder.addAll(values, this.goodsList_);
                    this.onChanged();
                }
                else {
                    this.goodsListBuilder_.addAllMessages(values);
                }
                return this;
            }
            
            public Builder clearGoodsList() {
                if (this.goodsListBuilder_ == null) {
                    this.goodsList_ = Collections.emptyList();
                    this.bitField0_ &= 0xFFFFFFFE;
                    this.onChanged();
                }
                else {
                    this.goodsListBuilder_.clear();
                }
                return this;
            }
            
            public Builder removeGoodsList(final int index) {
                if (this.goodsListBuilder_ == null) {
                    this.ensureGoodsListIsMutable();
                    this.goodsList_.remove(index);
                    this.onChanged();
                }
                else {
                    this.goodsListBuilder_.remove(index);
                }
                return this;
            }
            
            public ShopGoodsOuterClass.ShopGoods.Builder getGoodsListBuilder(final int index) {
                return this.getGoodsListFieldBuilder().getBuilder(index);
            }
            
            @Override
            public ShopGoodsOuterClass.ShopGoodsOrBuilder getGoodsListOrBuilder(final int index) {
                if (this.goodsListBuilder_ == null) {
                    return this.goodsList_.get(index);
                }
                return this.goodsListBuilder_.getMessageOrBuilder(index);
            }
            
            @Override
            public List<? extends ShopGoodsOuterClass.ShopGoodsOrBuilder> getGoodsListOrBuilderList() {
                if (this.goodsListBuilder_ != null) {
                    return this.goodsListBuilder_.getMessageOrBuilderList();
                }
                return Collections.unmodifiableList((List<? extends ShopGoodsOuterClass.ShopGoodsOrBuilder>)this.goodsList_);
            }
            
            public ShopGoodsOuterClass.ShopGoods.Builder addGoodsListBuilder() {
                return this.getGoodsListFieldBuilder().addBuilder(ShopGoodsOuterClass.ShopGoods.getDefaultInstance());
            }
            
            public ShopGoodsOuterClass.ShopGoods.Builder addGoodsListBuilder(final int index) {
                return this.getGoodsListFieldBuilder().addBuilder(index, ShopGoodsOuterClass.ShopGoods.getDefaultInstance());
            }
            
            public List<ShopGoodsOuterClass.ShopGoods.Builder> getGoodsListBuilderList() {
                return this.getGoodsListFieldBuilder().getBuilderList();
            }
            
            private RepeatedFieldBuilderV3<ShopGoodsOuterClass.ShopGoods, ShopGoodsOuterClass.ShopGoods.Builder, ShopGoodsOuterClass.ShopGoodsOrBuilder> getGoodsListFieldBuilder() {
                if (this.goodsListBuilder_ == null) {
                    this.goodsListBuilder_ = new RepeatedFieldBuilderV3<ShopGoodsOuterClass.ShopGoods, ShopGoodsOuterClass.ShopGoods.Builder, ShopGoodsOuterClass.ShopGoodsOrBuilder>(this.goodsList_, (this.bitField0_ & 0x1) != 0x0, this.getParentForChildren(), this.isClean());
                    this.goodsList_ = null;
                }
                return this.goodsListBuilder_;
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
    
    public interface BuyGoodsRspOrBuilder extends MessageOrBuilder
    {
        int getBuyCount();
        
        boolean hasGoods();
        
        ShopGoodsOuterClass.ShopGoods getGoods();
        
        ShopGoodsOuterClass.ShopGoodsOrBuilder getGoodsOrBuilder();
        
        int getShopType();
        
        int getRetcode();
        
        List<ShopGoodsOuterClass.ShopGoods> getGoodsListList();
        
        ShopGoodsOuterClass.ShopGoods getGoodsList(final int p0);
        
        int getGoodsListCount();
        
        List<? extends ShopGoodsOuterClass.ShopGoodsOrBuilder> getGoodsListOrBuilderList();
        
        ShopGoodsOuterClass.ShopGoodsOrBuilder getGoodsListOrBuilder(final int p0);
    }
}
