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

public final class PlayerPropChangeReasonNotifyOuterClass
{
    private static final Descriptors.Descriptor internal_static_PlayerPropChangeReasonNotify_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_PlayerPropChangeReasonNotify_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private PlayerPropChangeReasonNotifyOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return PlayerPropChangeReasonNotifyOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\"PlayerPropChangeReasonNotify.proto\u001a\u0016PropChangeReason.proto\"z\n\u001cPlayerPropChangeReasonNotify\u0012\u0011\n\tprop_type\u0018\u0006 \u0001(\r\u0012\u0011\n\told_value\u0018\f \u0001(\u0002\u0012!\n\u0006reason\u0018\u0001 \u0001(\u000e2\u0011.PropChangeReason\u0012\u0011\n\tcur_value\u0018\u000b \u0001(\u0002B\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        PlayerPropChangeReasonNotifyOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { PropChangeReasonOuterClass.getDescriptor() });
        internal_static_PlayerPropChangeReasonNotify_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerPropChangeReasonNotify_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(PlayerPropChangeReasonNotifyOuterClass.internal_static_PlayerPropChangeReasonNotify_descriptor, new String[] { "PropType", "OldValue", "Reason", "CurValue" });
        PropChangeReasonOuterClass.getDescriptor();
    }
    
    public static final class PlayerPropChangeReasonNotify extends GeneratedMessageV3 implements PlayerPropChangeReasonNotifyOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int PROP_TYPE_FIELD_NUMBER = 6;
        private int propType_;
        public static final int OLD_VALUE_FIELD_NUMBER = 12;
        private float oldValue_;
        public static final int REASON_FIELD_NUMBER = 1;
        private int reason_;
        public static final int CUR_VALUE_FIELD_NUMBER = 11;
        private float curValue_;
        private byte memoizedIsInitialized;
        private static final PlayerPropChangeReasonNotify DEFAULT_INSTANCE;
        private static final Parser<PlayerPropChangeReasonNotify> PARSER;
        
        private PlayerPropChangeReasonNotify(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private PlayerPropChangeReasonNotify() {
            this.memoizedIsInitialized = -1;
            this.reason_ = 0;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new PlayerPropChangeReasonNotify();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private PlayerPropChangeReasonNotify(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.reason_ = rawValue;
                            continue;
                        }
                        case 48: {
                            this.propType_ = input.readUInt32();
                            continue;
                        }
                        case 93: {
                            this.curValue_ = input.readFloat();
                            continue;
                        }
                        case 101: {
                            this.oldValue_ = input.readFloat();
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
            return PlayerPropChangeReasonNotifyOuterClass.internal_static_PlayerPropChangeReasonNotify_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return PlayerPropChangeReasonNotifyOuterClass.internal_static_PlayerPropChangeReasonNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerPropChangeReasonNotify.class, Builder.class);
        }
        
        @Override
        public int getPropType() {
            return this.propType_;
        }
        
        @Override
        public float getOldValue() {
            return this.oldValue_;
        }
        
        @Override
        public int getReasonValue() {
            return this.reason_;
        }
        
        @Override
        public PropChangeReasonOuterClass.PropChangeReason getReason() {
            final PropChangeReasonOuterClass.PropChangeReason result = PropChangeReasonOuterClass.PropChangeReason.valueOf(this.reason_);
            return (result == null) ? PropChangeReasonOuterClass.PropChangeReason.UNRECOGNIZED : result;
        }
        
        @Override
        public float getCurValue() {
            return this.curValue_;
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
            if (this.reason_ != PropChangeReasonOuterClass.PropChangeReason.PROP_CHANGE_REASON_NONE.getNumber()) {
                output.writeEnum(1, this.reason_);
            }
            if (this.propType_ != 0) {
                output.writeUInt32(6, this.propType_);
            }
            if (this.curValue_ != 0.0f) {
                output.writeFloat(11, this.curValue_);
            }
            if (this.oldValue_ != 0.0f) {
                output.writeFloat(12, this.oldValue_);
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
            if (this.reason_ != PropChangeReasonOuterClass.PropChangeReason.PROP_CHANGE_REASON_NONE.getNumber()) {
                size += CodedOutputStream.computeEnumSize(1, this.reason_);
            }
            if (this.propType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(6, this.propType_);
            }
            if (this.curValue_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(11, this.curValue_);
            }
            if (this.oldValue_ != 0.0f) {
                size += CodedOutputStream.computeFloatSize(12, this.oldValue_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PlayerPropChangeReasonNotify)) {
                return super.equals(obj);
            }
            final PlayerPropChangeReasonNotify other = (PlayerPropChangeReasonNotify)obj;
            return this.getPropType() == other.getPropType() && Float.floatToIntBits(this.getOldValue()) == Float.floatToIntBits(other.getOldValue()) && this.reason_ == other.reason_ && Float.floatToIntBits(this.getCurValue()) == Float.floatToIntBits(other.getCurValue()) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 6;
            hash = 53 * hash + this.getPropType();
            hash = 37 * hash + 12;
            hash = 53 * hash + Float.floatToIntBits(this.getOldValue());
            hash = 37 * hash + 1;
            hash = 53 * hash + this.reason_;
            hash = 37 * hash + 11;
            hash = 53 * hash + Float.floatToIntBits(this.getCurValue());
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static PlayerPropChangeReasonNotify parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return PlayerPropChangeReasonNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerPropChangeReasonNotify parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerPropChangeReasonNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerPropChangeReasonNotify parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return PlayerPropChangeReasonNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerPropChangeReasonNotify parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerPropChangeReasonNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerPropChangeReasonNotify parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return PlayerPropChangeReasonNotify.PARSER.parseFrom(data);
        }
        
        public static PlayerPropChangeReasonNotify parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return PlayerPropChangeReasonNotify.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static PlayerPropChangeReasonNotify parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerPropChangeReasonNotify.PARSER, input);
        }
        
        public static PlayerPropChangeReasonNotify parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerPropChangeReasonNotify.PARSER, input, extensionRegistry);
        }
        
        public static PlayerPropChangeReasonNotify parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerPropChangeReasonNotify.PARSER, input);
        }
        
        public static PlayerPropChangeReasonNotify parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(PlayerPropChangeReasonNotify.PARSER, input, extensionRegistry);
        }
        
        public static PlayerPropChangeReasonNotify parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerPropChangeReasonNotify.PARSER, input);
        }
        
        public static PlayerPropChangeReasonNotify parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(PlayerPropChangeReasonNotify.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return PlayerPropChangeReasonNotify.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final PlayerPropChangeReasonNotify prototype) {
            return PlayerPropChangeReasonNotify.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == PlayerPropChangeReasonNotify.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static PlayerPropChangeReasonNotify getDefaultInstance() {
            return PlayerPropChangeReasonNotify.DEFAULT_INSTANCE;
        }
        
        public static Parser<PlayerPropChangeReasonNotify> parser() {
            return PlayerPropChangeReasonNotify.PARSER;
        }
        
        @Override
        public Parser<PlayerPropChangeReasonNotify> getParserForType() {
            return PlayerPropChangeReasonNotify.PARSER;
        }
        
        @Override
        public PlayerPropChangeReasonNotify getDefaultInstanceForType() {
            return PlayerPropChangeReasonNotify.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new PlayerPropChangeReasonNotify();
            PARSER = new AbstractParser<PlayerPropChangeReasonNotify>() {
                @Override
                public PlayerPropChangeReasonNotify parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new PlayerPropChangeReasonNotify(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PlayerPropChangeReasonNotifyOrBuilder
        {
            private int propType_;
            private float oldValue_;
            private int reason_;
            private float curValue_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return PlayerPropChangeReasonNotifyOuterClass.internal_static_PlayerPropChangeReasonNotify_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return PlayerPropChangeReasonNotifyOuterClass.internal_static_PlayerPropChangeReasonNotify_fieldAccessorTable.ensureFieldAccessorsInitialized(PlayerPropChangeReasonNotify.class, Builder.class);
            }
            
            private Builder() {
                this.reason_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.reason_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (PlayerPropChangeReasonNotify.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.propType_ = 0;
                this.oldValue_ = 0.0f;
                this.reason_ = 0;
                this.curValue_ = 0.0f;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return PlayerPropChangeReasonNotifyOuterClass.internal_static_PlayerPropChangeReasonNotify_descriptor;
            }
            
            @Override
            public PlayerPropChangeReasonNotify getDefaultInstanceForType() {
                return PlayerPropChangeReasonNotify.getDefaultInstance();
            }
            
            @Override
            public PlayerPropChangeReasonNotify build() {
                final PlayerPropChangeReasonNotify result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public PlayerPropChangeReasonNotify buildPartial() {
                final PlayerPropChangeReasonNotify result = new PlayerPropChangeReasonNotify(this);
                result.propType_ = this.propType_;
                result.oldValue_ = this.oldValue_;
                result.reason_ = this.reason_;
                result.curValue_ = this.curValue_;
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
                if (other instanceof PlayerPropChangeReasonNotify) {
                    return this.mergeFrom((PlayerPropChangeReasonNotify)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final PlayerPropChangeReasonNotify other) {
                if (other == PlayerPropChangeReasonNotify.getDefaultInstance()) {
                    return this;
                }
                if (other.getPropType() != 0) {
                    this.setPropType(other.getPropType());
                }
                if (other.getOldValue() != 0.0f) {
                    this.setOldValue(other.getOldValue());
                }
                if (other.reason_ != 0) {
                    this.setReasonValue(other.getReasonValue());
                }
                if (other.getCurValue() != 0.0f) {
                    this.setCurValue(other.getCurValue());
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
                PlayerPropChangeReasonNotify parsedMessage = null;
                try {
                    parsedMessage = PlayerPropChangeReasonNotify.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (PlayerPropChangeReasonNotify)e.getUnfinishedMessage();
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
            public int getPropType() {
                return this.propType_;
            }
            
            public Builder setPropType(final int value) {
                this.propType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearPropType() {
                this.propType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public float getOldValue() {
                return this.oldValue_;
            }
            
            public Builder setOldValue(final float value) {
                this.oldValue_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearOldValue() {
                this.oldValue_ = 0.0f;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getReasonValue() {
                return this.reason_;
            }
            
            public Builder setReasonValue(final int value) {
                this.reason_ = value;
                this.onChanged();
                return this;
            }
            
            @Override
            public PropChangeReasonOuterClass.PropChangeReason getReason() {
                final PropChangeReasonOuterClass.PropChangeReason result = PropChangeReasonOuterClass.PropChangeReason.valueOf(this.reason_);
                return (result == null) ? PropChangeReasonOuterClass.PropChangeReason.UNRECOGNIZED : result;
            }
            
            public Builder setReason(final PropChangeReasonOuterClass.PropChangeReason value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                this.reason_ = value.getNumber();
                this.onChanged();
                return this;
            }
            
            public Builder clearReason() {
                this.reason_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public float getCurValue() {
                return this.curValue_;
            }
            
            public Builder setCurValue(final float value) {
                this.curValue_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearCurValue() {
                this.curValue_ = 0.0f;
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
    
    public interface PlayerPropChangeReasonNotifyOrBuilder extends MessageOrBuilder
    {
        int getPropType();
        
        float getOldValue();
        
        int getReasonValue();
        
        PropChangeReasonOuterClass.PropChangeReason getReason();
        
        float getCurValue();
    }
}
