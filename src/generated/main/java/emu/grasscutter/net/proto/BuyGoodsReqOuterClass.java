// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
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
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.Parser;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Descriptors;

public final class BuyGoodsReqOuterClass
{
    private static final Descriptors.Descriptor internal_static_BuyGoodsReq_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_BuyGoodsReq_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private BuyGoodsReqOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return BuyGoodsReqOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0011BuyGoodsReq.proto\u001a\u000fShopGoods.proto\"N\n\u000bBuyGoodsReq\u0012\u0011\n\tbuy_count\u0018\u000e \u0001(\r\u0012\u0019\n\u0005goods\u0018\u000f \u0001(\u000b2\n.ShopGoods\u0012\u0011\n\tshop_type\u0018\u0007 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        BuyGoodsReqOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { ShopGoodsOuterClass.getDescriptor() });
        internal_static_BuyGoodsReq_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_BuyGoodsReq_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(BuyGoodsReqOuterClass.internal_static_BuyGoodsReq_descriptor, new String[] { "BuyCount", "Goods", "ShopType" });
        ShopGoodsOuterClass.getDescriptor();
    }
    
    public static final class BuyGoodsReq extends GeneratedMessageV3 implements BuyGoodsReqOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int BUY_COUNT_FIELD_NUMBER = 14;
        private int buyCount_;
        public static final int GOODS_FIELD_NUMBER = 15;
        private ShopGoodsOuterClass.ShopGoods goods_;
        public static final int SHOP_TYPE_FIELD_NUMBER = 7;
        private int shopType_;
        private byte memoizedIsInitialized;
        private static final BuyGoodsReq DEFAULT_INSTANCE;
        private static final Parser<BuyGoodsReq> PARSER;
        
        private BuyGoodsReq(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private BuyGoodsReq() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new BuyGoodsReq();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private BuyGoodsReq(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 112: {
                            this.buyCount_ = input.readUInt32();
                            continue;
                        }
                        case 122: {
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
            return BuyGoodsReqOuterClass.internal_static_BuyGoodsReq_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return BuyGoodsReqOuterClass.internal_static_BuyGoodsReq_fieldAccessorTable.ensureFieldAccessorsInitialized(BuyGoodsReq.class, Builder.class);
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
            if (this.buyCount_ != 0) {
                output.writeUInt32(14, this.buyCount_);
            }
            if (this.goods_ != null) {
                output.writeMessage(15, this.getGoods());
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
            if (this.buyCount_ != 0) {
                size += CodedOutputStream.computeUInt32Size(14, this.buyCount_);
            }
            if (this.goods_ != null) {
                size += CodedOutputStream.computeMessageSize(15, this.getGoods());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BuyGoodsReq)) {
                return super.equals(obj);
            }
            final BuyGoodsReq other = (BuyGoodsReq)obj;
            return this.getBuyCount() == other.getBuyCount() && this.hasGoods() == other.hasGoods() && (!this.hasGoods() || this.getGoods().equals(other.getGoods())) && this.getShopType() == other.getShopType() && this.unknownFields.equals(other.unknownFields);
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
                hash = 37 * hash + 15;
                hash = 53 * hash + this.getGoods().hashCode();
            }
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getShopType();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static BuyGoodsReq parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return BuyGoodsReq.PARSER.parseFrom(data);
        }
        
        public static BuyGoodsReq parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BuyGoodsReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BuyGoodsReq parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return BuyGoodsReq.PARSER.parseFrom(data);
        }
        
        public static BuyGoodsReq parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BuyGoodsReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BuyGoodsReq parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return BuyGoodsReq.PARSER.parseFrom(data);
        }
        
        public static BuyGoodsReq parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return BuyGoodsReq.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static BuyGoodsReq parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BuyGoodsReq.PARSER, input);
        }
        
        public static BuyGoodsReq parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BuyGoodsReq.PARSER, input, extensionRegistry);
        }
        
        public static BuyGoodsReq parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BuyGoodsReq.PARSER, input);
        }
        
        public static BuyGoodsReq parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(BuyGoodsReq.PARSER, input, extensionRegistry);
        }
        
        public static BuyGoodsReq parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BuyGoodsReq.PARSER, input);
        }
        
        public static BuyGoodsReq parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(BuyGoodsReq.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return BuyGoodsReq.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final BuyGoodsReq prototype) {
            return BuyGoodsReq.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == BuyGoodsReq.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static BuyGoodsReq getDefaultInstance() {
            return BuyGoodsReq.DEFAULT_INSTANCE;
        }
        
        public static Parser<BuyGoodsReq> parser() {
            return BuyGoodsReq.PARSER;
        }
        
        @Override
        public Parser<BuyGoodsReq> getParserForType() {
            return BuyGoodsReq.PARSER;
        }
        
        @Override
        public BuyGoodsReq getDefaultInstanceForType() {
            return BuyGoodsReq.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new BuyGoodsReq();
            PARSER = new AbstractParser<BuyGoodsReq>() {
                @Override
                public BuyGoodsReq parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new BuyGoodsReq(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BuyGoodsReqOrBuilder
        {
            private int buyCount_;
            private ShopGoodsOuterClass.ShopGoods goods_;
            private SingleFieldBuilderV3<ShopGoodsOuterClass.ShopGoods, ShopGoodsOuterClass.ShopGoods.Builder, ShopGoodsOuterClass.ShopGoodsOrBuilder> goodsBuilder_;
            private int shopType_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return BuyGoodsReqOuterClass.internal_static_BuyGoodsReq_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return BuyGoodsReqOuterClass.internal_static_BuyGoodsReq_fieldAccessorTable.ensureFieldAccessorsInitialized(BuyGoodsReq.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (BuyGoodsReq.alwaysUseFieldBuilders) {}
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
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return BuyGoodsReqOuterClass.internal_static_BuyGoodsReq_descriptor;
            }
            
            @Override
            public BuyGoodsReq getDefaultInstanceForType() {
                return BuyGoodsReq.getDefaultInstance();
            }
            
            @Override
            public BuyGoodsReq build() {
                final BuyGoodsReq result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public BuyGoodsReq buildPartial() {
                final BuyGoodsReq result = new BuyGoodsReq(this);
                result.buyCount_ = this.buyCount_;
                if (this.goodsBuilder_ == null) {
                    result.goods_ = this.goods_;
                }
                else {
                    result.goods_ = this.goodsBuilder_.build();
                }
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
                if (other instanceof BuyGoodsReq) {
                    return this.mergeFrom((BuyGoodsReq)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final BuyGoodsReq other) {
                if (other == BuyGoodsReq.getDefaultInstance()) {
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
                BuyGoodsReq parsedMessage = null;
                try {
                    parsedMessage = BuyGoodsReq.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (BuyGoodsReq)e.getUnfinishedMessage();
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
            public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }
            
            @Override
            public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }
        }
    }
    
    public interface BuyGoodsReqOrBuilder extends MessageOrBuilder
    {
        int getBuyCount();
        
        boolean hasGoods();
        
        ShopGoodsOuterClass.ShopGoods getGoods();
        
        ShopGoodsOuterClass.ShopGoodsOrBuilder getGoodsOrBuilder();
        
        int getShopType();
    }
}
