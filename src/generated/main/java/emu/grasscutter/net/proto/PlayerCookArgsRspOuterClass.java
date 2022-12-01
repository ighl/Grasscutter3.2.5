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

public final class PlayerCookArgsRspOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerCookArgsRsp_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerCookArgsRsp_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerCookArgsRspOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerCookArgsRspOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0017PlayerCookArgsRsp.proto\"=\n\u0011PlayerCookArgsRsp\u0012\u000f\n\u0007retcode\u0018\u0004 \u0001(\u0005\u0012\u0017\n\u000fqte_range_ratio\u0018\f \u0001(\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerCookArgsRspOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_PlayerCookArgsRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerCookArgsRsp_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerCookArgsRspOuterClass.internal_static_PlayerCookArgsRsp_descriptor, new String[] { "Retcode", "QteRangeRatio" });
    }
    
    public static final class PlayerCookArgsRsp extends GeneratedMessageV3 implements PlayerCookArgsRspOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int RETCODE_FIELD_NUMBER = 4;
        private int retcode_;
        public static final int QTE_RANGE_RATIO_FIELD_NUMBER = 12;
        private float qteRangeRatio_;
        private byte memoizedIsInitialized;
        private static final PlayerCookArgsRsp DEFAULT_INSTANCE;
        private static final Parser<PlayerCookArgsRsp> PARSER;
        
        private PlayerCookArgsRsp(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerCookArgsRsp() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerCookArgsRsp();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerCookArgsRsp(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 32: {
                            this.retcode_ = input.readInt32();
                            continue;
                        }
                        case 101: {
                            this.qteRangeRatio_ = input.readFloat();
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
            return PlayerCookArgsRspOuterClass.internal_static_PlayerCookArgsRsp_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerCookArgsRspOuterClass.internal_static_PlayerCookArgsRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerCookArgsRsp.class, Builder.class);
        }
        
        @Override
        public int getRetcode() {
            return this.retcode_;
        }
        
        @Override
        public float getQteRangeRatio() {
            return this.qteRangeRatio_;
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
                output.writeInt32(4, this.retcode_);
            }
            if (this.qteRangeRatio_ != 0.0f) {
                output.writeFloat(12, this.qteRangeRatio_);
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
                size += CodedOutputStream.computeInt32Size(4, this.retcode_);
            }
            if (this.qteRangeRatio_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(12, this.qteRangeRatio_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerCookArgsRsp)) {
                return super.equals(obj);
            }
            final PlayerCookArgsRsp other = (PlayerCookArgsRsp)obj;
            return this.getRetcode() == other.getRetcode() && Float.floatToIntBits(this.getQteRangeRatio()) == Float.floatToIntBits(other.getQteRangeRatio()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getRetcode();
            hash = 37 * hash + 12;
            hash = 53 * hash + Float.floatToIntBits(this.getQteRangeRatio());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerCookArgsRsp parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerCookArgsRsp.PARSER.parseFrom(data);
        }
        
        public static PlayerCookArgsRsp parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerCookArgsRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerCookArgsRsp parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerCookArgsRsp.PARSER.parseFrom(data);
        }
        
        public static PlayerCookArgsRsp parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerCookArgsRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerCookArgsRsp parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerCookArgsRsp.PARSER.parseFrom(data);
        }
        
        public static PlayerCookArgsRsp parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerCookArgsRsp.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerCookArgsRsp parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerCookArgsRsp.PARSER, input);
        }
        
        public static PlayerCookArgsRsp parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerCookArgsRsp.PARSER, input, extensionRegistry);
        }
        
        public static PlayerCookArgsRsp parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerCookArgsRsp.PARSER, input);
        }
        
        public static PlayerCookArgsRsp parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerCookArgsRsp.PARSER, input, extensionRegistry);
        }
        
        public static PlayerCookArgsRsp parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerCookArgsRsp.PARSER, input);
        }
        
        public static PlayerCookArgsRsp parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerCookArgsRsp.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerCookArgsRsp.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerCookArgsRsp prototype) {
            return PlayerCookArgsRsp.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerCookArgsRsp.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerCookArgsRsp getDefaultInstance() {
            return PlayerCookArgsRsp.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerCookArgsRsp> parser() {
            return PlayerCookArgsRsp.PARSER;
        }
        
        @Override
        public Parser<PlayerCookArgsRsp> getParserForType() {
            return PlayerCookArgsRsp.PARSER;
        }
        
        @Override
        public PlayerCookArgsRsp getDefaultInstanceForType() {
            return PlayerCookArgsRsp.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerCookArgsRsp();
            PARSER = new AbstractParser<PlayerCookArgsRsp>() {
                @Override
                public PlayerCookArgsRsp parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerCookArgsRsp(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerCookArgsRspOrBuilder
        {
            private int retcode_;
            private float qteRangeRatio_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerCookArgsRspOuterClass.internal_static_PlayerCookArgsRsp_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerCookArgsRspOuterClass.internal_static_PlayerCookArgsRsp_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerCookArgsRsp.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerCookArgsRsp.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.retcode_ = 0;
                this.qteRangeRatio_ = 0.0f;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerCookArgsRspOuterClass.internal_static_PlayerCookArgsRsp_descriptor;
            }
            
            @Override
            public PlayerCookArgsRsp getDefaultInstanceForType() {
                return PlayerCookArgsRsp.getDefaultInstance();
            }
            
            @Override
            public PlayerCookArgsRsp build() {
                final PlayerCookArgsRsp result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerCookArgsRsp buildPartial() {
                final PlayerCookArgsRsp result = new PlayerCookArgsRsp(this);
                result.retcode_ = this.retcode_;
                result.qteRangeRatio_ = this.qteRangeRatio_;
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
                if (other instanceof PlayerCookArgsRsp) {
                    return this.mergeFrom((PlayerCookArgsRsp)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerCookArgsRsp other) {
                if (other == PlayerCookArgsRsp.getDefaultInstance()) {
                    return this;
                }
                if (other.getRetcode() != 0) {
                    this.setRetcode(other.getRetcode());
                }
                if (other.getQteRangeRatio() != 0.0f) {
                    this.setQteRangeRatio(other.getQteRangeRatio());
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
                PlayerCookArgsRsp parsedMessage = null;
                try {
                    parsedMessage = PlayerCookArgsRsp.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerCookArgsRsp)e.getUnfinishedMessage();
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
            public float getQteRangeRatio() {
                return this.qteRangeRatio_;
            }
            
            public Builder setQteRangeRatio(final float value) {
                this.qteRangeRatio_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearQteRangeRatio() {
                this.qteRangeRatio_ = 0.0f;
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
    
    public interface PlayerCookArgsRspOrBuilder extends MessageOrBuilder
    {
        int getRetcode();
        
        float getQteRangeRatio();
    }
}
