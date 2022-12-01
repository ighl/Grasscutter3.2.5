// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractMessage;
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

public final class GachaWishRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_GachaWishRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GachaWishRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private GachaWishRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return GachaWishRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0012GachaWishRsp.proto\"\u0096\u0001\n\fGachaWishRsp\u0012\u0012\n\ngacha_type\u0018\b \u0001(\r\u0012\u0019\n\u0011gacha_schedule_id\u0018\u0007 \u0001(\r\u0012\u0019\n\u0011wish_max_progress\u0018\u0002 \u0001(\r\u0012\u0015\n\rwish_progress\u0018\u0005 \u0001(\r\u0012\u0014\n\fwish_item_id\u0018\u0003 \u0001(\r\u0012\u000f\n\u0007retcode\u0018\u000e \u0001(\u0005B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        GachaWishRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_GachaWishRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_GachaWishRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(GachaWishRspOuterClass.internal_static_GachaWishRsp_descriptor, new String[] { "GachaType", "GachaScheduleId", "WishMaxProgress", "WishProgress", "WishItemId", "Retcode" });
    }
    
    public static final class GachaWishRsp extends GeneratedMessageV3 implements GachaWishRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int GACHA_TYPE_FIELD_NUMBER = 8;
        private int gachaType_;
        public static final int GACHA_SCHEDULE_ID_FIELD_NUMBER = 7;
        private int gachaScheduleId_;
        public static final int WISH_MAX_PROGRESS_FIELD_NUMBER = 2;
        private int wishMaxProgress_;
        public static final int WISH_PROGRESS_FIELD_NUMBER = 5;
        private int wishProgress_;
        public static final int WISH_ITEM_ID_FIELD_NUMBER = 3;
        private int wishItemId_;
        public static final int RETCODE_FIELD_NUMBER = 14;
        private int retcode_;
        private byte memoizedIsInitialized;
        private static final GachaWishRsp DEFAULT_INSTANCE;
        private static final Parser<GachaWishRsp> PARSER;
        
        private GachaWishRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private GachaWishRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new GachaWishRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private GachaWishRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 16: {
                            this.wishMaxProgress_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.wishItemId_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.wishProgress_ = input.readUInt32();
                            continue;
                        }
                        case 56: {
                            this.gachaScheduleId_ = input.readUInt32();
                            continue;
                        }
                        case 64: {
                            this.gachaType_ = input.readUInt32();
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
            return GachaWishRspOuterClass.internal_static_GachaWishRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return GachaWishRspOuterClass.internal_static_GachaWishRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GachaWishRsp.class, Builder.class);
        }
        
        @Override
        public int getGachaType() {
            return this.gachaType_;
        }
        
        @Override
        public int getGachaScheduleId() {
            return this.gachaScheduleId_;
        }
        
        @Override
        public int getWishMaxProgress() {
            return this.wishMaxProgress_;
        }
        
        @Override
        public int getWishProgress() {
            return this.wishProgress_;
        }
        
        @Override
        public int getWishItemId() {
            return this.wishItemId_;
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
            if (this.wishMaxProgress_ != 0) {
                output.writeUInt32(2, this.wishMaxProgress_);
            }
            if (this.wishItemId_ != 0) {
                output.writeUInt32(3, this.wishItemId_);
            }
            if (this.wishProgress_ != 0) {
                output.writeUInt32(5, this.wishProgress_);
            }
            if (this.gachaScheduleId_ != 0) {
                output.writeUInt32(7, this.gachaScheduleId_);
            }
            if (this.gachaType_ != 0) {
                output.writeUInt32(8, this.gachaType_);
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
            if (this.wishMaxProgress_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.wishMaxProgress_);
            }
            if (this.wishItemId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.wishItemId_);
            }
            if (this.wishProgress_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.wishProgress_);
            }
            if (this.gachaScheduleId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.gachaScheduleId_);
            }
            if (this.gachaType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(8, this.gachaType_);
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
            if (!(obj instanceof GachaWishRsp)) {
                return super.equals(obj);
            }
            final GachaWishRsp other = (GachaWishRsp)obj;
            return this.getGachaType() == other.getGachaType() && this.getGachaScheduleId() == other.getGachaScheduleId() && this.getWishMaxProgress() == other.getWishMaxProgress() && this.getWishProgress() == other.getWishProgress() && this.getWishItemId() == other.getWishItemId() && this.getRetcode() == other.getRetcode() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 8;
            hash = 53 * hash + this.getGachaType();
            hash = 37 * hash + 7;
            hash = 53 * hash + this.getGachaScheduleId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getWishMaxProgress();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getWishProgress();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getWishItemId();
            hash = 37 * hash + 14;
            hash = 53 * hash + this.getRetcode();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static GachaWishRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return GachaWishRsp.PARSER.parseFrom(data);
        }
        
        public static GachaWishRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GachaWishRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GachaWishRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return GachaWishRsp.PARSER.parseFrom(data);
        }
        
        public static GachaWishRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GachaWishRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GachaWishRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return GachaWishRsp.PARSER.parseFrom(data);
        }
        
        public static GachaWishRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return GachaWishRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static GachaWishRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GachaWishRsp.PARSER, input);
        }
        
        public static GachaWishRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GachaWishRsp.PARSER, input, extensionRegistry);
        }
        
        public static GachaWishRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GachaWishRsp.PARSER, input);
        }
        
        public static GachaWishRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(GachaWishRsp.PARSER, input, extensionRegistry);
        }
        
        public static GachaWishRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GachaWishRsp.PARSER, input);
        }
        
        public static GachaWishRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(GachaWishRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return GachaWishRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final GachaWishRsp prototype) {
            return GachaWishRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == GachaWishRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static GachaWishRsp getDefaultInstance() {
            return GachaWishRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<GachaWishRsp> parser() {
            return GachaWishRsp.PARSER;
        }
        
        @Override
        public Parser<GachaWishRsp> getParserForType() {
            return GachaWishRsp.PARSER;
        }
        
        @Override
        public GachaWishRsp getDefaultInstanceForType() {
            return GachaWishRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new GachaWishRsp();
            PARSER = new AbstractParser<GachaWishRsp>() {
                @Override
                public GachaWishRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new GachaWishRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GachaWishRspOrBuilder
        {
            private int gachaType_;
            private int gachaScheduleId_;
            private int wishMaxProgress_;
            private int wishProgress_;
            private int wishItemId_;
            private int retcode_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return GachaWishRspOuterClass.internal_static_GachaWishRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return GachaWishRspOuterClass.internal_static_GachaWishRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(GachaWishRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (GachaWishRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.gachaType_ = 0;
                this.gachaScheduleId_ = 0;
                this.wishMaxProgress_ = 0;
                this.wishProgress_ = 0;
                this.wishItemId_ = 0;
                this.retcode_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return GachaWishRspOuterClass.internal_static_GachaWishRsp_descriptor;
            }
            
            @Override
            public GachaWishRsp getDefaultInstanceForType() {
                return GachaWishRsp.getDefaultInstance();
            }
            
            @Override
            public GachaWishRsp build() {
                final GachaWishRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public GachaWishRsp buildPartial() {
                final GachaWishRsp result = new GachaWishRsp(this);
                result.gachaType_ = this.gachaType_;
                result.gachaScheduleId_ = this.gachaScheduleId_;
                result.wishMaxProgress_ = this.wishMaxProgress_;
                result.wishProgress_ = this.wishProgress_;
                result.wishItemId_ = this.wishItemId_;
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
                if (other instanceof GachaWishRsp) {
                    return this.mergeFrom((GachaWishRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final GachaWishRsp other) {
                if (other == GachaWishRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getGachaType() != 0) {
                    this.setGachaType(other.getGachaType());
                }
                if (other.getGachaScheduleId() != 0) {
                    this.setGachaScheduleId(other.getGachaScheduleId());
                }
                if (other.getWishMaxProgress() != 0) {
                    this.setWishMaxProgress(other.getWishMaxProgress());
                }
                if (other.getWishProgress() != 0) {
                    this.setWishProgress(other.getWishProgress());
                }
                if (other.getWishItemId() != 0) {
                    this.setWishItemId(other.getWishItemId());
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
                GachaWishRsp parsedMessage = null;
                try {
                    parsedMessage = GachaWishRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (GachaWishRsp)e.getUnfinishedMessage();
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
            public int getGachaType() {
                return this.gachaType_;
            }
            
            public Builder setGachaType(final int value) {
                this.gachaType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGachaType() {
                this.gachaType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getGachaScheduleId() {
                return this.gachaScheduleId_;
            }
            
            public Builder setGachaScheduleId(final int value) {
                this.gachaScheduleId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearGachaScheduleId() {
                this.gachaScheduleId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getWishMaxProgress() {
                return this.wishMaxProgress_;
            }
            
            public Builder setWishMaxProgress(final int value) {
                this.wishMaxProgress_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWishMaxProgress() {
                this.wishMaxProgress_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getWishProgress() {
                return this.wishProgress_;
            }
            
            public Builder setWishProgress(final int value) {
                this.wishProgress_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWishProgress() {
                this.wishProgress_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getWishItemId() {
                return this.wishItemId_;
            }
            
            public Builder setWishItemId(final int value) {
                this.wishItemId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearWishItemId() {
                this.wishItemId_ = 0;
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
    
    public interface GachaWishRspOrBuilder extends MessageOrBuilder
    {
        int getGachaType();
        
        int getGachaScheduleId();
        
        int getWishMaxProgress();
        
        int getWishProgress();
        
        int getWishItemId();
        
        int getRetcode();
    }
}
