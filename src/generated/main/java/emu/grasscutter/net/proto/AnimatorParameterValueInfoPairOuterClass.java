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

public final class AnimatorParameterValueInfoPairOuterClass
{
    private static final Descriptors.Descriptor internal_static_AnimatorParameterValueInfoPair_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AnimatorParameterValueInfoPair_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AnimatorParameterValueInfoPairOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AnimatorParameterValueInfoPairOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n$AnimatorParameterValueInfoPair.proto\u001a AnimatorParameterValueInfo.proto\"e\n\u001eAnimatorParameterValueInfoPair\u0012\u000f\n\u0007name_id\u0018\u0001 \u0001(\u0005\u00122\n\ranimator_para\u0018\u0002 \u0001(\u000b2\u001b.AnimatorParameterValueInfoB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AnimatorParameterValueInfoPairOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] { AnimatorParameterValueInfoOuterClass.getDescriptor() });
        internal_static_AnimatorParameterValueInfoPair_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AnimatorParameterValueInfoPair_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AnimatorParameterValueInfoPairOuterClass.internal_static_AnimatorParameterValueInfoPair_descriptor, new String[] { "NameId", "AnimatorPara" });
        AnimatorParameterValueInfoOuterClass.getDescriptor();
    }
    
    public static final class AnimatorParameterValueInfoPair extends GeneratedMessageV3 implements AnimatorParameterValueInfoPairOrBuilder
    {
        private static final long serialVersionUID = 0L;
        public static final int NAME_ID_FIELD_NUMBER = 1;
        private int nameId_;
        public static final int ANIMATOR_PARA_FIELD_NUMBER = 2;
        private AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo animatorPara_;
        private byte memoizedIsInitialized;
        private static final AnimatorParameterValueInfoPair DEFAULT_INSTANCE;
        private static final Parser<AnimatorParameterValueInfoPair> PARSER;
        
        private AnimatorParameterValueInfoPair(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = -1;
        }
        
        private AnimatorParameterValueInfoPair() {
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AnimatorParameterValueInfoPair();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AnimatorParameterValueInfoPair(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.nameId_ = input.readInt32();
                            continue;
                        }
                        case 18: {
                            AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.Builder subBuilder = null;
                            if (this.animatorPara_ != null) {
                                subBuilder = this.animatorPara_.toBuilder();
                            }
                            this.animatorPara_ = input.readMessage(AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.parser(), extensionRegistry);
                            if (subBuilder != null) {
                                subBuilder.mergeFrom(this.animatorPara_);
                                this.animatorPara_ = subBuilder.buildPartial();
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
            return AnimatorParameterValueInfoPairOuterClass.internal_static_AnimatorParameterValueInfoPair_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AnimatorParameterValueInfoPairOuterClass.internal_static_AnimatorParameterValueInfoPair_fieldAccessorTable.ensureFieldAccessorsInitialized(AnimatorParameterValueInfoPair.class, Builder.class);
        }
        
        @Override
        public int getNameId() {
            return this.nameId_;
        }
        
        @Override
        public boolean hasAnimatorPara() {
            return this.animatorPara_ != null;
        }
        
        @Override
        public AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo getAnimatorPara() {
            return (this.animatorPara_ == null) ? AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.getDefaultInstance() : this.animatorPara_;
        }
        
        @Override
        public AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfoOrBuilder getAnimatorParaOrBuilder() {
            return this.getAnimatorPara();
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
            if (this.nameId_ != 0) {
                output.writeInt32(1, this.nameId_);
            }
            if (this.animatorPara_ != null) {
                output.writeMessage(2, this.getAnimatorPara());
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
            if (this.nameId_ != 0) {
                size += CodedOutputStream.computeInt32Size(1, this.nameId_);
            }
            if (this.animatorPara_ != null) {
                size += CodedOutputStream.computeMessageSize(2, this.getAnimatorPara());
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AnimatorParameterValueInfoPair)) {
                return super.equals(obj);
            }
            final AnimatorParameterValueInfoPair other = (AnimatorParameterValueInfoPair)obj;
            return this.getNameId() == other.getNameId() && this.hasAnimatorPara() == other.hasAnimatorPara() && (!this.hasAnimatorPara() || this.getAnimatorPara().equals(other.getAnimatorPara())) && this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getNameId();
            if (this.hasAnimatorPara()) {
                hash = 37 * hash + 2;
                hash = 53 * hash + this.getAnimatorPara().hashCode();
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AnimatorParameterValueInfoPair parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AnimatorParameterValueInfoPair.PARSER.parseFrom(data);
        }
        
        public static AnimatorParameterValueInfoPair parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AnimatorParameterValueInfoPair.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AnimatorParameterValueInfoPair parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AnimatorParameterValueInfoPair.PARSER.parseFrom(data);
        }
        
        public static AnimatorParameterValueInfoPair parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AnimatorParameterValueInfoPair.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AnimatorParameterValueInfoPair parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AnimatorParameterValueInfoPair.PARSER.parseFrom(data);
        }
        
        public static AnimatorParameterValueInfoPair parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AnimatorParameterValueInfoPair.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AnimatorParameterValueInfoPair parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AnimatorParameterValueInfoPair.PARSER, input);
        }
        
        public static AnimatorParameterValueInfoPair parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AnimatorParameterValueInfoPair.PARSER, input, extensionRegistry);
        }
        
        public static AnimatorParameterValueInfoPair parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AnimatorParameterValueInfoPair.PARSER, input);
        }
        
        public static AnimatorParameterValueInfoPair parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AnimatorParameterValueInfoPair.PARSER, input, extensionRegistry);
        }
        
        public static AnimatorParameterValueInfoPair parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AnimatorParameterValueInfoPair.PARSER, input);
        }
        
        public static AnimatorParameterValueInfoPair parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AnimatorParameterValueInfoPair.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AnimatorParameterValueInfoPair.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AnimatorParameterValueInfoPair prototype) {
            return AnimatorParameterValueInfoPair.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AnimatorParameterValueInfoPair.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AnimatorParameterValueInfoPair getDefaultInstance() {
            return AnimatorParameterValueInfoPair.DEFAULT_INSTANCE;
        }
        
        public static Parser<AnimatorParameterValueInfoPair> parser() {
            return AnimatorParameterValueInfoPair.PARSER;
        }
        
        @Override
        public Parser<AnimatorParameterValueInfoPair> getParserForType() {
            return AnimatorParameterValueInfoPair.PARSER;
        }
        
        @Override
        public AnimatorParameterValueInfoPair getDefaultInstanceForType() {
            return AnimatorParameterValueInfoPair.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AnimatorParameterValueInfoPair();
            PARSER = new AbstractParser<AnimatorParameterValueInfoPair>() {
                @Override
                public AnimatorParameterValueInfoPair parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AnimatorParameterValueInfoPair(input, extensionRegistry);
                }
            };
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AnimatorParameterValueInfoPairOrBuilder
        {
            private int nameId_;
            private AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo animatorPara_;
            private SingleFieldBuilderV3<AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo, AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.Builder, AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfoOrBuilder> animatorParaBuilder_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AnimatorParameterValueInfoPairOuterClass.internal_static_AnimatorParameterValueInfoPair_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AnimatorParameterValueInfoPairOuterClass.internal_static_AnimatorParameterValueInfoPair_fieldAccessorTable.ensureFieldAccessorsInitialized(AnimatorParameterValueInfoPair.class, Builder.class);
            }
            
            private Builder() {
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AnimatorParameterValueInfoPair.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.nameId_ = 0;
                if (this.animatorParaBuilder_ == null) {
                    this.animatorPara_ = null;
                }
                else {
                    this.animatorPara_ = null;
                    this.animatorParaBuilder_ = null;
                }
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AnimatorParameterValueInfoPairOuterClass.internal_static_AnimatorParameterValueInfoPair_descriptor;
            }
            
            @Override
            public AnimatorParameterValueInfoPair getDefaultInstanceForType() {
                return AnimatorParameterValueInfoPair.getDefaultInstance();
            }
            
            @Override
            public AnimatorParameterValueInfoPair build() {
                final AnimatorParameterValueInfoPair result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AnimatorParameterValueInfoPair buildPartial() {
                final AnimatorParameterValueInfoPair result = new AnimatorParameterValueInfoPair(this);
                result.nameId_ = this.nameId_;
                if (this.animatorParaBuilder_ == null) {
                    result.animatorPara_ = this.animatorPara_;
                }
                else {
                    result.animatorPara_ = this.animatorParaBuilder_.build();
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
                if (other instanceof AnimatorParameterValueInfoPair) {
                    return this.mergeFrom((AnimatorParameterValueInfoPair)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AnimatorParameterValueInfoPair other) {
                if (other == AnimatorParameterValueInfoPair.getDefaultInstance()) {
                    return this;
                }
                if (other.getNameId() != 0) {
                    this.setNameId(other.getNameId());
                }
                if (other.hasAnimatorPara()) {
                    this.mergeAnimatorPara(other.getAnimatorPara());
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
                AnimatorParameterValueInfoPair parsedMessage = null;
                try {
                    parsedMessage = AnimatorParameterValueInfoPair.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AnimatorParameterValueInfoPair)e.getUnfinishedMessage();
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
            public int getNameId() {
                return this.nameId_;
            }
            
            public Builder setNameId(final int value) {
                this.nameId_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearNameId() {
                this.nameId_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasAnimatorPara() {
                return this.animatorParaBuilder_ != null || this.animatorPara_ != null;
            }
            
            @Override
            public AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo getAnimatorPara() {
                if (this.animatorParaBuilder_ == null) {
                    return (this.animatorPara_ == null) ? AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.getDefaultInstance() : this.animatorPara_;
                }
                return this.animatorParaBuilder_.getMessage();
            }
            
            public Builder setAnimatorPara(final AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo value) {
                if (this.animatorParaBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    this.animatorPara_ = value;
                    this.onChanged();
                }
                else {
                    this.animatorParaBuilder_.setMessage(value);
                }
                return this;
            }
            
            public Builder setAnimatorPara(final AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.Builder builderForValue) {
                if (this.animatorParaBuilder_ == null) {
                    this.animatorPara_ = builderForValue.build();
                    this.onChanged();
                }
                else {
                    this.animatorParaBuilder_.setMessage(builderForValue.build());
                }
                return this;
            }
            
            public Builder mergeAnimatorPara(final AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo value) {
                if (this.animatorParaBuilder_ == null) {
                    if (this.animatorPara_ != null) {
                        this.animatorPara_ = AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.newBuilder(this.animatorPara_).mergeFrom(value).buildPartial();
                    }
                    else {
                        this.animatorPara_ = value;
                    }
                    this.onChanged();
                }
                else {
                    this.animatorParaBuilder_.mergeFrom(value);
                }
                return this;
            }
            
            public Builder clearAnimatorPara() {
                if (this.animatorParaBuilder_ == null) {
                    this.animatorPara_ = null;
                    this.onChanged();
                }
                else {
                    this.animatorPara_ = null;
                    this.animatorParaBuilder_ = null;
                }
                return this;
            }
            
            public AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.Builder getAnimatorParaBuilder() {
                this.onChanged();
                return this.getAnimatorParaFieldBuilder().getBuilder();
            }
            
            @Override
            public AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfoOrBuilder getAnimatorParaOrBuilder() {
                if (this.animatorParaBuilder_ != null) {
                    return this.animatorParaBuilder_.getMessageOrBuilder();
                }
                return (this.animatorPara_ == null) ? AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.getDefaultInstance() : this.animatorPara_;
            }
            
            private SingleFieldBuilderV3<AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo, AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.Builder, AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfoOrBuilder> getAnimatorParaFieldBuilder() {
                if (this.animatorParaBuilder_ == null) {
                    this.animatorParaBuilder_ = new SingleFieldBuilderV3<AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo, AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo.Builder, AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfoOrBuilder>(this.getAnimatorPara(), this.getParentForChildren(), this.isClean());
                    this.animatorPara_ = null;
                }
                return this.animatorParaBuilder_;
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
    
    public interface AnimatorParameterValueInfoPairOrBuilder extends MessageOrBuilder
    {
        int getNameId();
        
        boolean hasAnimatorPara();
        
        AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfo getAnimatorPara();
        
        AnimatorParameterValueInfoOuterClass.AnimatorParameterValueInfoOrBuilder getAnimatorParaOrBuilder();
    }
}
