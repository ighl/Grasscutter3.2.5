// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Message;
import java.io.InputStream;
import java.nio.ByteBuffer;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ByteString;
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

public final class GetBattlePassProductRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_GetBattlePassProductRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GetBattlePassProductRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GetBattlePassProductRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GetBattlePassProductRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001dGetBattlePassProductRsp.proto\"\u0092\u0001\n\u0017GetBattlePassProductRsp\u0012\u000f\n\u0007retcode\u0018\u000e \u0001(\u0005\u0012\u0012\n\nprice_tier\u0018\u0006 \u0001(\t\u0012%\n\u001dbattle_pass_product_play_type\u0018\u0002 \u0001(\r\u0012\u0012\n\nproduct_id\u0018\u0001 \u0001(\t\u0012\u0017\n\u000fcur_schedule_id\u0018\u000b \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GetBattlePassProductRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_GetBattlePassProductRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GetBattlePassProductRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GetBattlePassProductRspOuterClass.internal_static_GetBattlePassProductRsp_descriptor, new String[] { "Retcode", "PriceTier", "BattlePassProductPlayType", "ProductId", "CurScheduleId" });
    }
    
    public static final class GetBattlePassProductRsp extends GeneratedMessageV3 implements GetBattlePassProductRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 14;
        private int retcode_;
        public static final int PRICE_TIER_FIELD_NUMBER = 6;
        private volatile Object priceTier_;
        public static final int BATTLE_PASS_PRODUCT_PLAY_TYPE_FIELD_NUMBER = 2;
        private int battlePassProductPlayType_;
        public static final int PRODUCT_ID_FIELD_NUMBER = 1;
        private volatile Object productId_;
        public static final int CUR_SCHEDULE_ID_FIELD_NUMBER = 11;
        private int curScheduleId_;
        private byte memoizedIsInitialized;
        private static final GetBattlePassProductRsp DEFAULT_INSTANCE;
        private static final Parser<GetBattlePassProductRsp> PARSER;
        
        private GetBattlePassProductRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GetBattlePassProductRsp() {
            this.memoizedIsInitialized = -1;
            this.priceTier_ = "";
            this.productId_ = "";
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GetBattlePassProductRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GetBattlePassProductRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 10: {
                            final String s = input.readStringRequireUtf8();
                            this.productId_ = s;
                            continue;
                        }
                        case 16: {
                            this.battlePassProductPlayType_ = input.readUInt32();
                            continue;
                        }
                        case 50: {
                            final String s = input.readStringRequireUtf8();
                            this.priceTier_ = s;
                            continue;
                        }
                        case 88: {
                            this.curScheduleId_ = input.readUInt32();
                            continue;
                        }
                        case 112: {
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
                this.unknownFields = unknownFields.build();
                this.makeExtensionsImmutable();
            }
        }
        
        public static final Descriptors.Descriptor getDescriptor() {
            return GetBattlePassProductRspOuterClass.internal_static_GetBattlePassProductRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GetBattlePassProductRspOuterClass.internal_static_GetBattlePassProductRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetBattlePassProductRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public String getPriceTier() {
            final Object ref = this.priceTier_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.priceTier_ = s);
        }
        
        @Override
        public ByteString getPriceTierBytes() {
            final Object ref = this.priceTier_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.priceTier_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getBattlePassProductPlayType() {
            return this.battlePassProductPlayType_;
        }
        
        @Override
        public String getProductId() {
            final Object ref = this.productId_;
            if (ref instanceof String) {
                return (String)ref;
            }
            final ByteString bs = (ByteString)ref;
            final String s = bs.toStringUtf8();
            return (String)(this.productId_ = s);
        }
        
        @Override
        public ByteString getProductIdBytes() {
            final Object ref = this.productId_;
            if (ref instanceof String) {
                final ByteString b = ByteString.copyFromUtf8((String)ref);
                return (ByteString)(this.productId_ = b);
            }
            return (ByteString)ref;
        }
        
        @Override
        public int getCurScheduleId() {
            return this.curScheduleId_;
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
            if (!GeneratedMessageV3.isStringEmpty(this.productId_)) {
                GeneratedMessageV3.writeString(output, 1, this.productId_);
            }
            if (this.battlePassProductPlayType_ != 0) {
                output.writeUInt32(2, this.battlePassProductPlayType_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.priceTier_)) {
                GeneratedMessageV3.writeString(output, 6, this.priceTier_);
            }
            if (this.curScheduleId_ != 0) {
                output.writeUInt32(11, this.curScheduleId_);
            }
            if (this.retcode_ != 0) {
                output.writeInt32(14, this.retcode_);
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
            if (!GeneratedMessageV3.isStringEmpty(this.productId_)) {
                size += GeneratedMessageV3.computeStringSize(1, this.productId_);
            }
            if (this.battlePassProductPlayType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.battlePassProductPlayType_);
            }
            if (!GeneratedMessageV3.isStringEmpty(this.priceTier_)) {
                size += GeneratedMessageV3.computeStringSize(6, this.priceTier_);
            }
            if (this.curScheduleId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(11, this.curScheduleId_);
            }
            if (this.retcode_ != 0) {
                size += CodedOutputStream.computeInt32Size(14, this.retcode_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetBattlePassProductRsp)) {
                return super.equals(obj);
            }
            final GetBattlePassProductRsp other = (GetBattlePassProductRsp)obj;
            return this.getRetcode() == other.getRetcode() && this.getPriceTier().equals(other.getPriceTier()) && this.getBattlePassProductPlayType() == other.getBattlePassProductPlayType() && this.getProductId().equals(other.getProductId()) && this.getCurScheduleId() == other.getCurScheduleId() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getPriceTier().hashCode();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getBattlePassProductPlayType();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getProductId().hashCode();
            hash = 37 * hash + 11;
            hash = 53 * hash + this.getCurScheduleId();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GetBattlePassProductRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GetBattlePassProductRsp.PARSER.parseFrom(data);
        }
        
        public static GetBattlePassProductRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetBattlePassProductRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetBattlePassProductRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GetBattlePassProductRsp.PARSER.parseFrom(data);
        }
        
        public static GetBattlePassProductRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetBattlePassProductRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetBattlePassProductRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GetBattlePassProductRsp.PARSER.parseFrom(data);
        }
        
        public static GetBattlePassProductRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GetBattlePassProductRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GetBattlePassProductRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetBattlePassProductRsp.PARSER, input);
        }
        
        public static GetBattlePassProductRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetBattlePassProductRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetBattlePassProductRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetBattlePassProductRsp.PARSER, input);
        }
        
        public static GetBattlePassProductRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GetBattlePassProductRsp.PARSER, input, extensionRegistry);
        }
        
        public static GetBattlePassProductRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetBattlePassProductRsp.PARSER, input);
        }
        
        public static GetBattlePassProductRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GetBattlePassProductRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GetBattlePassProductRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GetBattlePassProductRsp prototype) {
            return GetBattlePassProductRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GetBattlePassProductRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GetBattlePassProductRsp getDefaultInstance() {
            return GetBattlePassProductRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<GetBattlePassProductRsp> parser() {
            return GetBattlePassProductRsp.PARSER;
        }
        
        @Override
        public Parser<GetBattlePassProductRsp> getParserForType() {
            return GetBattlePassProductRsp.PARSER;
        }
        
        @Override
        public GetBattlePassProductRsp getDefaultInstanceForType() {
            return GetBattlePassProductRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GetBattlePassProductRsp();
            PARSER = new AbstractParser<GetBattlePassProductRsp>() {
                @Override
                public GetBattlePassProductRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GetBattlePassProductRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetBattlePassProductRspOrBuilder
        {
            private int retcode_;
            private Object priceTier_;
            private int battlePassProductPlayType_;
            private Object productId_;
            private int curScheduleId_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GetBattlePassProductRspOuterClass.internal_static_GetBattlePassProductRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GetBattlePassProductRspOuterClass.internal_static_GetBattlePassProductRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GetBattlePassProductRsp.class, Builder.class);
            }
            
            private Builder() {
                this.priceTier_ = "";
                this.productId_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.priceTier_ = "";
                this.productId_ = "";
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GetBattlePassProductRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.priceTier_ = "";
                this.battlePassProductPlayType_ = 0;
                this.productId_ = "";
                this.curScheduleId_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GetBattlePassProductRspOuterClass.internal_static_GetBattlePassProductRsp_descriptor;
            }
            
            @Override
            public GetBattlePassProductRsp getDefaultInstanceForType() {
                return GetBattlePassProductRsp.getDefaultInstance();
            }
            
            @Override
            public GetBattlePassProductRsp build() {
                final GetBattlePassProductRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GetBattlePassProductRsp buildPartial() {
                final GetBattlePassProductRsp result = new GetBattlePassProductRsp(this);
                result.retcode_ = this.retcode_;
                result.priceTier_ = this.priceTier_;
                result.battlePassProductPlayType_ = this.battlePassProductPlayType_;
                result.productId_ = this.productId_;
                result.curScheduleId_ = this.curScheduleId_;
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
                if (other instanceof GetBattlePassProductRsp) {
                    return this.mergeFrom((GetBattlePassProductRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GetBattlePassProductRsp other) {
                if (other == GetBattlePassProductRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (!other.getPriceTier().isEmpty()) {
                    this.priceTier_ = other.priceTier_;
                    this.onChanged();
                }
                if (other.getBattlePassProductPlayType() != 0) {
                    this.setBattlePassProductPlayType(other.getBattlePassProductPlayType());
                }
                if (!other.getProductId().isEmpty()) {
                    this.productId_ = other.productId_;
                    this.onChanged();
                }
                if (other.getCurScheduleId() != 0) {
                    this.setCurScheduleId(other.getCurScheduleId());
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
                GetBattlePassProductRsp parsedMessage = null;
                try {
                    parsedMessage = GetBattlePassProductRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GetBattlePassProductRsp)e.getUnfinishedMessage();
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
            
            @Override
            public String getPriceTier() {
                final Object ref = this.priceTier_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.priceTier_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getPriceTierBytes() {
                final Object ref = this.priceTier_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.priceTier_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setPriceTier(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.priceTier_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPriceTier() {
                this.priceTier_ = GetBattlePassProductRsp.getDefaultInstance().getPriceTier();
                this.onChanged();
                return this;
            }
            
            public Builder setPriceTierBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.priceTier_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getBattlePassProductPlayType() {
                return this.battlePassProductPlayType_;
            }
            
            public Builder setBattlePassProductPlayType(final int value) {
                this.battlePassProductPlayType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBattlePassProductPlayType() {
                this.battlePassProductPlayType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public String getProductId() {
                final Object ref = this.productId_;
                if (!(ref instanceof String)) {
                    final ByteString bs = (ByteString)ref;
                    final String s = bs.toStringUtf8();
                    return (String)(this.productId_ = s);
                }
                return (String)ref;
            }
            
            @Override
            public ByteString getProductIdBytes() {
                final Object ref = this.productId_;
                if (ref instanceof String) {
                    final ByteString b = ByteString.copyFromUtf8((String)ref);
                    return (ByteString)(this.productId_ = b);
                }
                return (ByteString)ref;
            }
            
            public Builder setProductId(final String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.productId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearProductId() {
                this.productId_ = GetBattlePassProductRsp.getDefaultInstance().getProductId();
                this.onChanged();
                return this;
            }
            
            public Builder setProductIdBytes(final ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                AbstractMessageLite.checkByteStringIsUtf8(value);
                this.productId_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getCurScheduleId() {
                return this.curScheduleId_;
            }
            
            public Builder setCurScheduleId(final int value) {
                this.curScheduleId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurScheduleId() {
                this.curScheduleId_ = 0;
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
    
    public interface GetBattlePassProductRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        String getPriceTier();
        
        ByteString getPriceTierBytes();
        
        int getBattlePassProductPlayType();
        
        String getProductId();
        
        ByteString getProductIdBytes();
        
        int getCurScheduleId();
    }
}
