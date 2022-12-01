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

public final class SceneFishInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_SceneFishInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_SceneFishInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private SceneFishInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return SceneFishInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n\u0013SceneFishInfo.proto\u001a\fVector.proto\"\u0097\u0001\n\rSceneFishInfo\u0012\u000f\n\u0007fish_id\u0018\u0001 \u0001(\r\u0012\u001b\n\u0013fish_pool_entity_id\u0018\u0002 \u0001(\r\u0012\u001e\n\rfish_pool_pos\u0018\u0003 \u0001(\u000b2\u0007.Vector\u0012\u001b\n\u0013fish_pool_gadget_id\u0018\u0004 \u0001(\r\u0012\u001b\n\u0013Unk2700_HIPFHKFMBBE\u0018\u0005 \u0001(\rB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        SceneFishInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { VectorOuterClass.getDescriptor() });
        internal_static_SceneFishInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_SceneFishInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(SceneFishInfoOuterClass.internal_static_SceneFishInfo_descriptor, new String[] { "FishId", "FishPoolEntityId", "FishPoolPos", "FishPoolGadgetId", "Unk2700HIPFHKFMBBE" });
        VectorOuterClass.getDescriptor();
    }
    
    public static final class SceneFishInfo extends GeneratedMessageV3 implements SceneFishInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int FISH_ID_FIELD_NUMBER = 1;
        private int fishId_;
        public static final int FISH_POOL_ENTITY_ID_FIELD_NUMBER = 2;
        private int fishPoolEntityId_;
        public static final int FISH_POOL_POS_FIELD_NUMBER = 3;
        private VectorOuterClass.Vector fishPoolPos_;
        public static final int FISH_POOL_GADGET_ID_FIELD_NUMBER = 4;
        private int fishPoolGadgetId_;
        public static final int UNK2700_HIPFHKFMBBE_FIELD_NUMBER = 5;
        private int unk2700HIPFHKFMBBE_;
        private byte memoizedIsInitialized;
        private static final SceneFishInfo DEFAULT_INSTANCE;
        private static final Parser<SceneFishInfo> PARSER;
        
        private SceneFishInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private SceneFishInfo() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new SceneFishInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private SceneFishInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.fishId_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.fishPoolEntityId_ = input.readUInt32();
                            continue;
                        }
                        case 26: {
                            VectorOuterClass.Vector.Builder subBuilder = null;
                            if (this.fishPoolPos_ != null) {
                                subBuilder = this.fishPoolPos_.toBuilder();
                            }
                            this.fishPoolPos_ = input.readMessage(VectorOuterClass.Vector.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.fishPoolPos_);
                                this.fishPoolPos_ = subBuilder.buildPartial();
                                continue;
                            }
                            continue;
                        }
                        case 32: {
                            this.fishPoolGadgetId_ = input.readUInt32();
                            continue;
                        }
                        case 40: {
                            this.unk2700HIPFHKFMBBE_ = input.readUInt32();
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
            return SceneFishInfoOuterClass.internal_static_SceneFishInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return SceneFishInfoOuterClass.internal_static_SceneFishInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneFishInfo.class, Builder.class);
        }
        
        @Override
        public int getFishId() {
            return this.fishId_;
        }
        
        @Override
        public int getFishPoolEntityId() {
            return this.fishPoolEntityId_;
        }
        
        @Override
        public boolean hasFishPoolPos() {
            return this.fishPoolPos_ != null;
        }
        
        @Override
        public VectorOuterClass.Vector getFishPoolPos() {
            return (this.fishPoolPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.fishPoolPos_;
        }
        
        @Override
        public VectorOuterClass.VectorOrBuilder getFishPoolPosOrBuilder() {
            return this.getFishPoolPos();
        }
        
        @Override
        public int getFishPoolGadgetId() {
            return this.fishPoolGadgetId_;
        }
        
        @Override
        public int getUnk2700HIPFHKFMBBE() {
            return this.unk2700HIPFHKFMBBE_;
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
            if (this.fishId_ != 0) {
                output.writeUInt32(1, this.fishId_);
            }
            if (this.fishPoolEntityId_ != 0) {
                output.writeUInt32(2, this.fishPoolEntityId_);
            }
            if (this.fishPoolPos_ != null) {
                output.writeMessage(3, this.getFishPoolPos());
            }
            if (this.fishPoolGadgetId_ != 0) {
                output.writeUInt32(4, this.fishPoolGadgetId_);
            }
            if (this.unk2700HIPFHKFMBBE_ != 0) {
                output.writeUInt32(5, this.unk2700HIPFHKFMBBE_);
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
            if (this.fishId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.fishId_);
            }
            if (this.fishPoolEntityId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(2, this.fishPoolEntityId_);
            }
            if (this.fishPoolPos_ != null) {
                size += CodedOutputStream.computeMessageSize(3, this.getFishPoolPos());
            }
            if (this.fishPoolGadgetId_ != 0) {
                size += CodedOutputStream.computeUInt32Size(4, this.fishPoolGadgetId_);
            }
            if (this.unk2700HIPFHKFMBBE_ != 0) {
                size += CodedOutputStream.computeUInt32Size(5, this.unk2700HIPFHKFMBBE_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SceneFishInfo)) {
                return super.equals(obj);
            }
            final SceneFishInfo other = (SceneFishInfo)obj;
            return this.getFishId() == other.getFishId() && this.getFishPoolEntityId() == other.getFishPoolEntityId() && this.hasFishPoolPos() == other.hasFishPoolPos() && (!this.hasFishPoolPos() || this.getFishPoolPos().equals(other.getFishPoolPos())) && this.getFishPoolGadgetId() == other.getFishPoolGadgetId() && this.getUnk2700HIPFHKFMBBE() == other.getUnk2700HIPFHKFMBBE() && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getFishId();
            hash = 37 * hash + 2;
            hash = 53 * hash + this.getFishPoolEntityId();
            if (this.hasFishPoolPos()) {
                hash = 37 * hash + 3;
                hash = 53 * hash + this.getFishPoolPos().hashCode();
            }
            hash = 37 * hash + 4;
            hash = 53 * hash + this.getFishPoolGadgetId();
            hash = 37 * hash + 5;
            hash = 53 * hash + this.getUnk2700HIPFHKFMBBE();
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static SceneFishInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return SceneFishInfo.PARSER.parseFrom(data);
        }
        
        public static SceneFishInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneFishInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneFishInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return SceneFishInfo.PARSER.parseFrom(data);
        }
        
        public static SceneFishInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneFishInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneFishInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return SceneFishInfo.PARSER.parseFrom(data);
        }
        
        public static SceneFishInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return SceneFishInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static SceneFishInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneFishInfo.PARSER, input);
        }
        
        public static SceneFishInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneFishInfo.PARSER, input, extensionRegistry);
        }
        
        public static SceneFishInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneFishInfo.PARSER, input);
        }
        
        public static SceneFishInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(SceneFishInfo.PARSER, input, extensionRegistry);
        }
        
        public static SceneFishInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneFishInfo.PARSER, input);
        }
        
        public static SceneFishInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(SceneFishInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return SceneFishInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final SceneFishInfo prototype) {
            return SceneFishInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == SceneFishInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static SceneFishInfo getDefaultInstance() {
            return SceneFishInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<SceneFishInfo> parser() {
            return SceneFishInfo.PARSER;
        }
        
        @Override
        public Parser<SceneFishInfo> getParserForType() {
            return SceneFishInfo.PARSER;
        }
        
        @Override
        public SceneFishInfo getDefaultInstanceForType() {
            return SceneFishInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new SceneFishInfo();
            PARSER = new AbstractParser<SceneFishInfo>() {
                @Override
                public SceneFishInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new SceneFishInfo(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SceneFishInfoOrBuilder
        {
            private int fishId_;
            private int fishPoolEntityId_;
            private VectorOuterClass.Vector fishPoolPos_;
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> fishPoolPosBuilder_;
            private int fishPoolGadgetId_;
            private int unk2700HIPFHKFMBBE_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return SceneFishInfoOuterClass.internal_static_SceneFishInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return SceneFishInfoOuterClass.internal_static_SceneFishInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SceneFishInfo.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (SceneFishInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.fishId_ = 0;
                this.fishPoolEntityId_ = 0;
                if (this.fishPoolPosBuilder_ == null) {
                    this.fishPoolPos_ = null;
                }
                else {
                    this.fishPoolPos_ = null;
                    this.fishPoolPosBuilder_ = null;
                }
                this.fishPoolGadgetId_ = 0;
                this.unk2700HIPFHKFMBBE_ = 0;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return SceneFishInfoOuterClass.internal_static_SceneFishInfo_descriptor;
            }
            
            @Override
            public SceneFishInfo getDefaultInstanceForType() {
                return SceneFishInfo.getDefaultInstance();
            }
            
            @Override
            public SceneFishInfo build() {
                final SceneFishInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public SceneFishInfo buildPartial() {
                final SceneFishInfo result = new SceneFishInfo(this);
                result.fishId_ = this.fishId_;
                result.fishPoolEntityId_ = this.fishPoolEntityId_;
                if (this.fishPoolPosBuilder_ == null) {
                    result.fishPoolPos_ = this.fishPoolPos_;
                }
                else {
                    result.fishPoolPos_ = this.fishPoolPosBuilder_.build();
                }
                result.fishPoolGadgetId_ = this.fishPoolGadgetId_;
                result.unk2700HIPFHKFMBBE_ = this.unk2700HIPFHKFMBBE_;
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
                if (other instanceof SceneFishInfo) {
                    return this.mergeFrom((SceneFishInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final SceneFishInfo other) {
                if (other == SceneFishInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getFishId() != 0) {
                    this.setFishId(other.getFishId());
                }
                if (other.getFishPoolEntityId() != 0) {
                    this.setFishPoolEntityId(other.getFishPoolEntityId());
                }
                if (other.hasFishPoolPos()) {
                    this.mergeFishPoolPos(other.getFishPoolPos());
                }
                if (other.getFishPoolGadgetId() != 0) {
                    this.setFishPoolGadgetId(other.getFishPoolGadgetId());
                }
                if (other.getUnk2700HIPFHKFMBBE() != 0) {
                    this.setUnk2700HIPFHKFMBBE(other.getUnk2700HIPFHKFMBBE());
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
                SceneFishInfo parsedMessage = null;
                try {
                    parsedMessage = SceneFishInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (SceneFishInfo)e.getUnfinishedMessage();
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
            public int getFishId() {
                return this.fishId_;
            }
            
            public Builder setFishId(final int value) {
                this.fishId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFishId() {
                this.fishId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getFishPoolEntityId() {
                return this.fishPoolEntityId_;
            }
            
            public Builder setFishPoolEntityId(final int value) {
                this.fishPoolEntityId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFishPoolEntityId() {
                this.fishPoolEntityId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasFishPoolPos() {
                return this.fishPoolPosBuilder_ != null || this.fishPoolPos_ != null;
            }
            
            @Override
            public VectorOuterClass.Vector getFishPoolPos() {
                if (this.fishPoolPosBuilder_ == null) {
                    return (this.fishPoolPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.fishPoolPos_;
                }
                return this.fishPoolPosBuilder_.getMessage();
            }
            
            public Builder setFishPoolPos(final VectorOuterClass.Vector value) {
                if (this.fishPoolPosBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.fishPoolPos_ = value;
                    this.onChanged();
                }
                else {
                    this.fishPoolPosBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setFishPoolPos(final VectorOuterClass.Vector.Builder builderForValue) {
                if (this.fishPoolPosBuilder_ == null) {
                    this.fishPoolPos_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.fishPoolPosBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeFishPoolPos(final VectorOuterClass.Vector value) {
                if (this.fishPoolPosBuilder_ == null) {
                    if (this.fishPoolPos_ != null) {
                        this.fishPoolPos_ = VectorOuterClass.Vector.newBuilder(this.fishPoolPos_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.fishPoolPos_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.fishPoolPosBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearFishPoolPos() {
                if (this.fishPoolPosBuilder_ == null) {
                    this.fishPoolPos_ = null;
                    this.onChanged();
                }
                else {
                    this.fishPoolPos_ = null;
                    this.fishPoolPosBuilder_ = null;
                }
                return this;
            }
            
            public VectorOuterClass.Vector.Builder getFishPoolPosBuilder() {
                this.onChanged();
                return this.getFishPoolPosFieldBuilder().getBuilder();
            }
            
            @Override
            public VectorOuterClass.VectorOrBuilder getFishPoolPosOrBuilder() {
                if (this.fishPoolPosBuilder_ != null) {
                    return this.fishPoolPosBuilder_.getMessageOrBuilder();
                }
                return (this.fishPoolPos_ == null) ? VectorOuterClass.Vector.getDefaultInstance() : this.fishPoolPos_;
            }
            
            private SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder> getFishPoolPosFieldBuilder() {
                if (this.fishPoolPosBuilder_ == null) {
                    this.fishPoolPosBuilder_ = new SingleFieldBuilderV3<VectorOuterClass.Vector, VectorOuterClass.Vector.Builder, VectorOuterClass.VectorOrBuilder>(this.getFishPoolPos(), this.getParentForChildren(), this.isClean());
                    this.fishPoolPos_ = null;
                }
                return this.fishPoolPosBuilder_;
            }
            
            @Override
            public int getFishPoolGadgetId() {
                return this.fishPoolGadgetId_;
            }
            
            public Builder setFishPoolGadgetId(final int value) {
                this.fishPoolGadgetId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFishPoolGadgetId() {
                this.fishPoolGadgetId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getUnk2700HIPFHKFMBBE() {
                return this.unk2700HIPFHKFMBBE_;
            }
            
            public Builder setUnk2700HIPFHKFMBBE(final int value) {
                this.unk2700HIPFHKFMBBE_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearUnk2700HIPFHKFMBBE() {
                this.unk2700HIPFHKFMBBE_ = 0;
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
    
    public interface SceneFishInfoOrBuilder extends MessageOrBuilder
    {
        int getFishId();
        
        int getFishPoolEntityId();
        
        boolean hasFishPoolPos();
        
        VectorOuterClass.Vector getFishPoolPos();
        
        VectorOuterClass.VectorOrBuilder getFishPoolPosOrBuilder();
        
        int getFishPoolGadgetId();
        
        int getUnk2700HIPFHKFMBBE();
    }
}
