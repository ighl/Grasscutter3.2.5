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

public final class AvatarExpeditionInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_AvatarExpeditionInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AvatarExpeditionInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AvatarExpeditionInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AvatarExpeditionInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u001aAvatarExpeditionInfo.proto\u001a\u001bAvatarExpeditionState.proto\"\u008b\u0001\n\u0014AvatarExpeditionInfo\u0012%\n\u0005state\u0018\u0001 \u0001(\u000e2\u0016.AvatarExpeditionState\u0012\u000e\n\u0006exp_id\u0018\u0002 \u0001(\r\u0012\u0011\n\thour_time\u0018\u0003 \u0001(\r\u0012\u0012\n\nstart_time\u0018\u0004 \u0001(\r\u0012\u0015\n\rshorten_ratio\u0018\u0005 \u0001(\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AvatarExpeditionInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AvatarExpeditionStateOuterClass.getDescriptor() });
        internal_static_AvatarExpeditionInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AvatarExpeditionInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AvatarExpeditionInfoOuterClass.internal_static_AvatarExpeditionInfo_descriptor, new String[] { "State", "ExpId", "HourTime", "StartTime", "ShortenRatio" });
        AvatarExpeditionStateOuterClass.getDescriptor();
    }
    
    public static final class AvatarExpeditionInfo extends GeneratedMessageV3 implements AvatarExpeditionInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int STATE_FIELD_NUMBER = 1;
        private int state_;
        public static final int EXP_ID_FIELD_NUMBER = 2;
        private int expId_;
        public static final int HOUR_TIME_FIELD_NUMBER = 3;
        private int hourTime_;
        public static final int START_TIME_FIELD_NUMBER = 4;
        private int startTime_;
        public static final int SHORTEN_RATIO_FIELD_NUMBER = 5;
        private float shortenRatio_;
        private byte memoizedIsInitialized;
        private static final AvatarExpeditionInfo DEFAULT_INSTANCE;
        private static final Parser<AvatarExpeditionInfo> PARSER;
        
        private AvatarExpeditionInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AvatarExpeditionInfo() {
            this.memoizedIsInitialized = -1;
            this.state_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AvatarExpeditionInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AvatarExpeditionInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                        case 8: {
                            final int rawValue = input.readEnum();
                            this.state_ = rawValue;
                            continue;
                        }
                        case 16: {
                            this.expId_ = input.readUInt32();
                            continue;
                        }
                        case 24: {
                            this.hourTime_ = input.readUInt32();
                            continue;
                        }
                        case 32: {
                            this.startTime_ = input.readUInt32();
                            continue;
                        }
                        case 45: {
                            this.shortenRatio_ = input.readFloat();
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
            return AvatarExpeditionInfoOuterClass.internal_static_AvatarExpeditionInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AvatarExpeditionInfoOuterClass.internal_static_AvatarExpeditionInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarExpeditionInfo.class, Builder.class);
        }
        
        @Override
        public int getStateValue() {
            return this.state_;
        }
        
        @Override
        public AvatarExpeditionStateOuterClass.AvatarExpeditionState getState() {
            final AvatarExpeditionStateOuterClass.AvatarExpeditionState result = AvatarExpeditionStateOuterClass.AvatarExpeditionState.valueOf(this.state_);
            return (result == null) ? AvatarExpeditionStateOuterClass.AvatarExpeditionState.UNRECOGNIZED : result;
        }
        
        @Override
        public int getExpId() {
            return this.expId_;
        }
        
        @Override
        public int getHourTime() {
            return this.hourTime_;
        }
        
        @Override
        public int getStartTime() {
            return this.startTime_;
        }
        
        @Override
        public float getShortenRatio() {
            return this.shortenRatio_;
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
            if (this.state_ != AvatarExpeditionStateOuterClass.AvatarExpeditionState.AVATAR_EXPEDITION_STATE_NONE.getNumber()) {
                output.writeEnum(1, this.state_);
            }
            if (this.expId_ != 0) {
                output.writeUInt32(2, this.expId_);
            }
            if (this.hourTime_ != 0) {
                output.writeUInt32(3, this.hourTime_);
            }
            if (this.startTime_ != 0) {
                output.writeUInt32(4, this.startTime_);
            }
            if (this.shortenRatio_ != 0.0f) {
                output.writeFloat(5, this.shortenRatio_);
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
            if (this.state_ != AvatarExpeditionStateOuterClass.AvatarExpeditionState.AVATAR_EXPEDITION_STATE_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(1, this.state_);
            }
            if (this.expId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.expId_);
            }
            if (this.hourTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(3, this.hourTime_);
            }
            if (this.startTime_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.startTime_);
            }
            if (this.shortenRatio_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(5, this.shortenRatio_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AvatarExpeditionInfo)) {
                return super.equals(obj);
            }
            final AvatarExpeditionInfo other = (AvatarExpeditionInfo)obj;
            return this.state_ == other.state_ && this.getExpId() == other.getExpId() && this.getHourTime() == other.getHourTime() && this.getStartTime() == other.getStartTime() && Float.floatToIntBits(this.getShortenRatio()) == Float.floatToIntBits(other.getShortenRatio()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.state_;
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getExpId();
            hash = 37 * hash + 3;
            hash = 53 * hash + this.getHourTime();
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getStartTime();
            hash = 37 * hash + 5;
            hash = 53 * hash + Float.floatToIntBits(this.getShortenRatio());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AvatarExpeditionInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AvatarExpeditionInfo.PARSER.parseFrom(data);
        }
        
        public static AvatarExpeditionInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExpeditionInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExpeditionInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AvatarExpeditionInfo.PARSER.parseFrom(data);
        }
        
        public static AvatarExpeditionInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExpeditionInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExpeditionInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AvatarExpeditionInfo.PARSER.parseFrom(data);
        }
        
        public static AvatarExpeditionInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AvatarExpeditionInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AvatarExpeditionInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionInfo.PARSER, input);
        }
        
        public static AvatarExpeditionInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionInfo.PARSER, input, extensionRegistry);
        }
        
        public static AvatarExpeditionInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarExpeditionInfo.PARSER, input);
        }
        
        public static AvatarExpeditionInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AvatarExpeditionInfo.PARSER, input, extensionRegistry);
        }
        
        public static AvatarExpeditionInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionInfo.PARSER, input);
        }
        
        public static AvatarExpeditionInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AvatarExpeditionInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AvatarExpeditionInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AvatarExpeditionInfo prototype) {
            return AvatarExpeditionInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AvatarExpeditionInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AvatarExpeditionInfo getDefaultInstance() {
            return AvatarExpeditionInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<AvatarExpeditionInfo> parser() {
            return AvatarExpeditionInfo.PARSER;
        }
        
        @Override
        public Parser<AvatarExpeditionInfo> getParserForType() {
            return AvatarExpeditionInfo.PARSER;
        }
        
        @Override
        public AvatarExpeditionInfo getDefaultInstanceForType() {
            return AvatarExpeditionInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AvatarExpeditionInfo();
            PARSER = new AbstractParser<AvatarExpeditionInfo>() {
                @Override
                public AvatarExpeditionInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AvatarExpeditionInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AvatarExpeditionInfoOrBuilder
        {
            private int state_;
            private int expId_;
            private int hourTime_;
            private int startTime_;
            private float shortenRatio_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AvatarExpeditionInfoOuterClass.internal_static_AvatarExpeditionInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AvatarExpeditionInfoOuterClass.internal_static_AvatarExpeditionInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AvatarExpeditionInfo.class, Builder.class);
            }
            
            private Builder() {
                this.state_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.state_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AvatarExpeditionInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.state_ = 0;
                this.expId_ = 0;
                this.hourTime_ = 0;
                this.startTime_ = 0;
                this.shortenRatio_ = 0.0f;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AvatarExpeditionInfoOuterClass.internal_static_AvatarExpeditionInfo_descriptor;
            }
            
            @Override
            public AvatarExpeditionInfo getDefaultInstanceForType() {
                return AvatarExpeditionInfo.getDefaultInstance();
            }
            
            @Override
            public AvatarExpeditionInfo build() {
                final AvatarExpeditionInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AvatarExpeditionInfo buildPartial() {
                final AvatarExpeditionInfo result = new AvatarExpeditionInfo(this);
                result.state_ = this.state_;
                result.expId_ = this.expId_;
                result.hourTime_ = this.hourTime_;
                result.startTime_ = this.startTime_;
                result.shortenRatio_ = this.shortenRatio_;
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
                if (other instanceof AvatarExpeditionInfo) {
                    return this.mergeFrom((AvatarExpeditionInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AvatarExpeditionInfo other) {
                if (other == AvatarExpeditionInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.state_ != 0) {
                    this.setStateValue(other.getStateValue());
                }
                if (other.getExpId() != 0) {
                    this.setExpId(other.getExpId());
                }
                if (other.getHourTime() != 0) {
                    this.setHourTime(other.getHourTime());
                }
                if (other.getStartTime() != 0) {
                    this.setStartTime(other.getStartTime());
                }
                if (other.getShortenRatio() != 0.0f) {
                    this.setShortenRatio(other.getShortenRatio());
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
                AvatarExpeditionInfo parsedMessage = null;
                try {
                    parsedMessage = AvatarExpeditionInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AvatarExpeditionInfo)e.getUnfinishedMessage();
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
            public int getStateValue() {
                return this.state_;
            }
            
            public Builder setStateValue(final int value) {
                this.state_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public AvatarExpeditionStateOuterClass.AvatarExpeditionState getState() {
                final AvatarExpeditionStateOuterClass.AvatarExpeditionState result = AvatarExpeditionStateOuterClass.AvatarExpeditionState.valueOf(this.state_);
                return (result == null) ? AvatarExpeditionStateOuterClass.AvatarExpeditionState.UNRECOGNIZED : result;
            }
            
            public Builder setState(final AvatarExpeditionStateOuterClass.AvatarExpeditionState value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.state_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearState() {
                this.state_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getExpId() {
                return this.expId_;
            }
            
            public Builder setExpId(final int value) {
                this.expId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearExpId() {
                this.expId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getHourTime() {
                return this.hourTime_;
            }
            
            public Builder setHourTime(final int value) {
                this.hourTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearHourTime() {
                this.hourTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getStartTime() {
                return this.startTime_;
            }
            
            public Builder setStartTime(final int value) {
                this.startTime_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearStartTime() {
                this.startTime_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public float getShortenRatio() {
                return this.shortenRatio_;
            }
            
            public Builder setShortenRatio(final float value) {
                this.shortenRatio_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearShortenRatio() {
                this.shortenRatio_ = 0.0f;
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
    
    public interface AvatarExpeditionInfoOrBuilder extends MessageOrBuilder
    {
        int getStateValue();
        
        AvatarExpeditionStateOuterClass.AvatarExpeditionState getState();
        
        int getExpId();
        
        int getHourTime();
        
        int getStartTime();
        
        float getShortenRatio();
    }
}
