// 
// Decompiled by Procyon v0.5.36
// 

package emu.grasscutter.net.proto;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Message;
import java.io.InputStream;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import com.google.protobuf.Internal;
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

public final class AnimatorParameterValueInfoOuterClass
{
    private static final Descriptors.Descriptor internal_static_AnimatorParameterValueInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_AnimatorParameterValueInfo_fieldAccessorTable;
    private static Descriptors.FileDescriptor descriptor;
    
    private AnimatorParameterValueInfoOuterClass() {
    }
    
    public static void registerAllExtensions(final ExtensionRegistryLite registry) {
    }
    
    public static void registerAllExtensions(final ExtensionRegistry registry) {
        registerAllExtensions((ExtensionRegistryLite)registry);
    }
    
    public static Descriptors.FileDescriptor getDescriptor() {
        return AnimatorParameterValueInfoOuterClass.descriptor;
    }
    
    static {
        final String[] descriptorData = { "\n AnimatorParameterValueInfo.proto\"w\n\u001aAnimatorParameterValueInfo\u0012\u0011\n\tpara_type\u0018\u0001 \u0001(\r\u0012\u0011\n\u0007int_val\u0018\u0002 \u0001(\u0005H\u0000\u0012\u0013\n\tfloat_val\u0018\u0003 \u0001(\u0002H\u0000\u0012\u0012\n\bbool_val\u0018\u0004 \u0001(\bH\u0000B\n\n\bpara_valB\u001b\n\u0019emu.grasscutter.net.protob\u0006proto3" };
        AnimatorParameterValueInfoOuterClass.descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[0]);
        internal_static_AnimatorParameterValueInfo_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_AnimatorParameterValueInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(AnimatorParameterValueInfoOuterClass.internal_static_AnimatorParameterValueInfo_descriptor, new String[] { "ParaType", "IntVal", "FloatVal", "BoolVal", "ParaVal" });
    }
    
    public static final class AnimatorParameterValueInfo extends GeneratedMessageV3 implements AnimatorParameterValueInfoOrBuilder
    {
        private static final long serialVersionUID = 0L;
        private int paraValCase_;
        private Object paraVal_;
        public static final int PARA_TYPE_FIELD_NUMBER = 1;
        private int paraType_;
        public static final int INT_VAL_FIELD_NUMBER = 2;
        public static final int FLOAT_VAL_FIELD_NUMBER = 3;
        public static final int BOOL_VAL_FIELD_NUMBER = 4;
        private byte memoizedIsInitialized;
        private static final AnimatorParameterValueInfo DEFAULT_INSTANCE;
        private static final Parser<AnimatorParameterValueInfo> PARSER;
        
        private AnimatorParameterValueInfo(final GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.paraValCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        private AnimatorParameterValueInfo() {
            this.paraValCase_ = 0;
            this.memoizedIsInitialized = -1;
        }
        
        @Override
        protected Object newInstance(final UnusedPrivateParameter unused) {
            return new AnimatorParameterValueInfo();
        }
        
        @Override
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }
        
        private AnimatorParameterValueInfo(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
                            this.paraType_ = input.readUInt32();
                            continue;
                        }
                        case 16: {
                            this.paraValCase_ = 2;
                            this.paraVal_ = input.readInt32();
                            continue;
                        }
                        case 29: {
                            this.paraValCase_ = 3;
                            this.paraVal_ = input.readFloat();
                            continue;
                        }
                        case 32: {
                            this.paraValCase_ = 4;
                            this.paraVal_ = input.readBool();
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
            return AnimatorParameterValueInfoOuterClass.internal_static_AnimatorParameterValueInfo_descriptor;
        }
        
        @Override
        protected FieldAccessorTable internalGetFieldAccessorTable() {
            return AnimatorParameterValueInfoOuterClass.internal_static_AnimatorParameterValueInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AnimatorParameterValueInfo.class, Builder.class);
        }
        
        @Override
        public ParaValCase getParaValCase() {
            return ParaValCase.forNumber(this.paraValCase_);
        }
        
        @Override
        public int getParaType() {
            return this.paraType_;
        }
        
        @Override
        public boolean hasIntVal() {
            return this.paraValCase_ == 2;
        }
        
        @Override
        public int getIntVal() {
            if (this.paraValCase_ == 2) {
                return (int)this.paraVal_;
            }
            return 0;
        }
        
        @Override
        public boolean hasFloatVal() {
            return this.paraValCase_ == 3;
        }
        
        @Override
        public float getFloatVal() {
            if (this.paraValCase_ == 3) {
                return (float)this.paraVal_;
            }
            return 0.0f;
        }
        
        @Override
        public boolean hasBoolVal() {
            return this.paraValCase_ == 4;
        }
        
        @Override
        public boolean getBoolVal() {
            return this.paraValCase_ == 4 && (boolean)this.paraVal_;
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
            if (this.paraType_ != 0) {
                output.writeUInt32(1, this.paraType_);
            }
            if (this.paraValCase_ == 2) {
                output.writeInt32(2, (int)this.paraVal_);
            }
            if (this.paraValCase_ == 3) {
                output.writeFloat(3, (float)this.paraVal_);
            }
            if (this.paraValCase_ == 4) {
                output.writeBool(4, (boolean)this.paraVal_);
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
            if (this.paraType_ != 0) {
                size += CodedOutputStream.computeUInt32Size(1, this.paraType_);
            }
            if (this.paraValCase_ == 2) {
                size += CodedOutputStream.computeInt32Size(2, (int)this.paraVal_);
            }
            if (this.paraValCase_ == 3) {
                size += CodedOutputStream.computeFloatSize(3, (float)this.paraVal_);
            }
            if (this.paraValCase_ == 4) {
                size += CodedOutputStream.computeBoolSize(4, (boolean)this.paraVal_);
            }
            size += this.unknownFields.getSerializedSize();
            return this.memoizedSize = size;
        }
        
        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AnimatorParameterValueInfo)) {
                return super.equals(obj);
            }
            final AnimatorParameterValueInfo other = (AnimatorParameterValueInfo)obj;
            if (this.getParaType() != other.getParaType()) {
                return false;
            }
            if (!this.getParaValCase().equals(other.getParaValCase())) {
                return false;
            }
            switch (this.paraValCase_) {
                case 2: {
                    if (this.getIntVal() != other.getIntVal()) {
                        return false;
                    }
                    break;
                }
                case 3: {
                    if (Float.floatToIntBits(this.getFloatVal()) != Float.floatToIntBits(other.getFloatVal())) {
                        return false;
                    }
                    break;
                }
                case 4: {
                    if (this.getBoolVal() != other.getBoolVal()) {
                        return false;
                    }
                    break;
                }
            }
            return this.unknownFields.equals(other.unknownFields);
        }
        
        @Override
        public int hashCode() {
            if (this.memoizedHashCode != 0) {
                return this.memoizedHashCode;
            }
            int hash = 41;
            hash = 19 * hash + getDescriptor().hashCode();
            hash = 37 * hash + 1;
            hash = 53 * hash + this.getParaType();
            switch (this.paraValCase_) {
                case 2: {
                    hash = 37 * hash + 2;
                    hash = 53 * hash + this.getIntVal();
                    break;
                }
                case 3: {
                    hash = 37 * hash + 3;
                    hash = 53 * hash + Float.floatToIntBits(this.getFloatVal());
                    break;
                }
                case 4: {
                    hash = 37 * hash + 4;
                    hash = 53 * hash + Internal.hashBoolean(this.getBoolVal());
                    break;
                }
            }
            hash = 29 * hash + this.unknownFields.hashCode();
            return this.memoizedHashCode = hash;
        }
        
        public static AnimatorParameterValueInfo parseFrom(final ByteBuffer data) throws InvalidProtocolBufferException {
            return AnimatorParameterValueInfo.PARSER.parseFrom(data);
        }
        
        public static AnimatorParameterValueInfo parseFrom(final ByteBuffer data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AnimatorParameterValueInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AnimatorParameterValueInfo parseFrom(final ByteString data) throws InvalidProtocolBufferException {
            return AnimatorParameterValueInfo.PARSER.parseFrom(data);
        }
        
        public static AnimatorParameterValueInfo parseFrom(final ByteString data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AnimatorParameterValueInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AnimatorParameterValueInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
            return AnimatorParameterValueInfo.PARSER.parseFrom(data);
        }
        
        public static AnimatorParameterValueInfo parseFrom(final byte[] data, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return AnimatorParameterValueInfo.PARSER.parseFrom(data, extensionRegistry);
        }
        
        public static AnimatorParameterValueInfo parseFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AnimatorParameterValueInfo.PARSER, input);
        }
        
        public static AnimatorParameterValueInfo parseFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AnimatorParameterValueInfo.PARSER, input, extensionRegistry);
        }
        
        public static AnimatorParameterValueInfo parseDelimitedFrom(final InputStream input) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AnimatorParameterValueInfo.PARSER, input);
        }
        
        public static AnimatorParameterValueInfo parseDelimitedFrom(final InputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseDelimitedWithIOException(AnimatorParameterValueInfo.PARSER, input, extensionRegistry);
        }
        
        public static AnimatorParameterValueInfo parseFrom(final CodedInputStream input) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AnimatorParameterValueInfo.PARSER, input);
        }
        
        public static AnimatorParameterValueInfo parseFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws IOException {
            return GeneratedMessageV3.parseWithIOException(AnimatorParameterValueInfo.PARSER, input, extensionRegistry);
        }
        
        @Override
        public Builder newBuilderForType() {
            return newBuilder();
        }
        
        public static Builder newBuilder() {
            return AnimatorParameterValueInfo.DEFAULT_INSTANCE.toBuilder();
        }
        
        public static Builder newBuilder(final AnimatorParameterValueInfo prototype) {
            return AnimatorParameterValueInfo.DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        
        @Override
        public Builder toBuilder() {
            return (this == AnimatorParameterValueInfo.DEFAULT_INSTANCE) ? new Builder() : new Builder().mergeFrom(this);
        }
        
        @Override
        protected Builder newBuilderForType(final BuilderParent parent) {
            final Builder builder = new Builder(parent);
            return builder;
        }
        
        public static AnimatorParameterValueInfo getDefaultInstance() {
            return AnimatorParameterValueInfo.DEFAULT_INSTANCE;
        }
        
        public static Parser<AnimatorParameterValueInfo> parser() {
            return AnimatorParameterValueInfo.PARSER;
        }
        
        @Override
        public Parser<AnimatorParameterValueInfo> getParserForType() {
            return AnimatorParameterValueInfo.PARSER;
        }
        
        @Override
        public AnimatorParameterValueInfo getDefaultInstanceForType() {
            return AnimatorParameterValueInfo.DEFAULT_INSTANCE;
        }
        
        static {
            DEFAULT_INSTANCE = new AnimatorParameterValueInfo();
            PARSER = new AbstractParser<AnimatorParameterValueInfo>() {
                @Override
                public AnimatorParameterValueInfo parsePartialFrom(final CodedInputStream input, final ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return new AnimatorParameterValueInfo(input, extensionRegistry);
                }
            };
        }
        
        public enum ParaValCase implements Internal.EnumLite, InternalOneOfEnum
        {
            INT_VAL(2), 
            FLOAT_VAL(3), 
            BOOL_VAL(4), 
            PARAVAL_NOT_SET(0);
            
            private final int value;
            
            private ParaValCase(final int value) {
                this.value = value;
            }
            
            @Deprecated
            public static ParaValCase valueOf(final int value) {
                return forNumber(value);
            }
            
            public static ParaValCase forNumber(final int value) {
                switch (value) {
                    case 2: {
                        return ParaValCase.INT_VAL;
                    }
                    case 3: {
                        return ParaValCase.FLOAT_VAL;
                    }
                    case 4: {
                        return ParaValCase.BOOL_VAL;
                    }
                    case 0: {
                        return ParaValCase.PARAVAL_NOT_SET;
                    }
                    default: {
                        return null;
                    }
                }
            }
            
            @Override
            public int getNumber() {
                return this.value;
            }
            
            private static /* synthetic */ ParaValCase[] value() {
                return new ParaValCase[] { ParaValCase.INT_VAL, ParaValCase.FLOAT_VAL, ParaValCase.BOOL_VAL, ParaValCase.PARAVAL_NOT_SET };
            }
            
            
        }
        
        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AnimatorParameterValueInfoOrBuilder
        {
            private int paraValCase_;
            private Object paraVal_;
            private int paraType_;
            
            public static final Descriptors.Descriptor getDescriptor() {
                return AnimatorParameterValueInfoOuterClass.internal_static_AnimatorParameterValueInfo_descriptor;
            }
            
            @Override
            protected FieldAccessorTable internalGetFieldAccessorTable() {
                return AnimatorParameterValueInfoOuterClass.internal_static_AnimatorParameterValueInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(AnimatorParameterValueInfo.class, Builder.class);
            }
            
            private Builder() {
                this.paraValCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private Builder(final GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                this.paraValCase_ = 0;
                this.maybeForceBuilderInitialization();
            }
            
            private void maybeForceBuilderInitialization() {
                if (AnimatorParameterValueInfo.alwaysUseFieldBuilders) {}
            }
            
            @Override
            public Builder clear() {
                super.clear();
                this.paraType_ = 0;
                this.paraValCase_ = 0;
                this.paraVal_ = null;
                return this;
            }
            
            @Override
            public Descriptors.Descriptor getDescriptorForType() {
                return AnimatorParameterValueInfoOuterClass.internal_static_AnimatorParameterValueInfo_descriptor;
            }
            
            @Override
            public AnimatorParameterValueInfo getDefaultInstanceForType() {
                return AnimatorParameterValueInfo.getDefaultInstance();
            }
            
            @Override
            public AnimatorParameterValueInfo build() {
                final AnimatorParameterValueInfo result = this.buildPartial();
                if (!result.isInitialized()) {
                    throw AbstractMessage.Builder.newUninitializedMessageException(result);
                }
                return result;
            }
            
            @Override
            public AnimatorParameterValueInfo buildPartial() {
                final AnimatorParameterValueInfo result = new AnimatorParameterValueInfo(this);
                result.paraType_ = this.paraType_;
                if (this.paraValCase_ == 2) {
                    result.paraVal_ = this.paraVal_;
                }
                if (this.paraValCase_ == 3) {
                    result.paraVal_ = this.paraVal_;
                }
                if (this.paraValCase_ == 4) {
                    result.paraVal_ = this.paraVal_;
                }
                result.paraValCase_ = this.paraValCase_;
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
                if (other instanceof AnimatorParameterValueInfo) {
                    return this.mergeFrom((AnimatorParameterValueInfo)other);
                }
                super.mergeFrom(other);
                return this;
            }
            
            public Builder mergeFrom(final AnimatorParameterValueInfo other) {
                if (other == AnimatorParameterValueInfo.getDefaultInstance()) {
                    return this;
                }
                if (other.getParaType() != 0) {
                    this.setParaType(other.getParaType());
                }
                switch (other.getParaValCase()) {
                    case INT_VAL: {
                        this.setIntVal(other.getIntVal());
                        break;
                    }
                    case FLOAT_VAL: {
                        this.setFloatVal(other.getFloatVal());
                        break;
                    }
                    case BOOL_VAL: {
                        this.setBoolVal(other.getBoolVal());
                        break;
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
                AnimatorParameterValueInfo parsedMessage = null;
                try {
                    parsedMessage = AnimatorParameterValueInfo.PARSER.parsePartialFrom(input, extensionRegistry);
                }
                catch (InvalidProtocolBufferException e) {
                    parsedMessage = (AnimatorParameterValueInfo)e.getUnfinishedMessage();
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
            public ParaValCase getParaValCase() {
                return ParaValCase.forNumber(this.paraValCase_);
            }
            
            public Builder clearParaVal() {
                this.paraValCase_ = 0;
                this.paraVal_ = null;
                this.onChanged();
                return this;
            }
            
            @Override
            public int getParaType() {
                return this.paraType_;
            }
            
            public Builder setParaType(final int value) {
                this.paraType_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearParaType() {
                this.paraType_ = 0;
                this.onChanged();
                return this;
            }
            
            @Override
            public boolean hasIntVal() {
                return this.paraValCase_ == 2;
            }
            
            @Override
            public int getIntVal() {
                if (this.paraValCase_ == 2) {
                    return (int)this.paraVal_;
                }
                return 0;
            }
            
            public Builder setIntVal(final int value) {
                this.paraValCase_ = 2;
                this.paraVal_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearIntVal() {
                if (this.paraValCase_ == 2) {
                    this.paraValCase_ = 0;
                    this.paraVal_ = null;
                    this.onChanged();
                }
                return this;
            }
            
            @Override
            public boolean hasFloatVal() {
                return this.paraValCase_ == 3;
            }
            
            @Override
            public float getFloatVal() {
                if (this.paraValCase_ == 3) {
                    return (float)this.paraVal_;
                }
                return 0.0f;
            }
            
            public Builder setFloatVal(final float value) {
                this.paraValCase_ = 3;
                this.paraVal_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearFloatVal() {
                if (this.paraValCase_ == 3) {
                    this.paraValCase_ = 0;
                    this.paraVal_ = null;
                    this.onChanged();
                }
                return this;
            }
            
            @Override
            public boolean hasBoolVal() {
                return this.paraValCase_ == 4;
            }
            
            @Override
            public boolean getBoolVal() {
                return this.paraValCase_ == 4 && (boolean)this.paraVal_;
            }
            
            public Builder setBoolVal(final boolean value) {
                this.paraValCase_ = 4;
                this.paraVal_ = value;
                this.onChanged();
                return this;
            }
            
            public Builder clearBoolVal() {
                if (this.paraValCase_ == 4) {
                    this.paraValCase_ = 0;
                    this.paraVal_ = null;
                    this.onChanged();
                }
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
    
    public interface AnimatorParameterValueInfoOrBuilder extends MessageOrBuilder
    {
        int getParaType();
        
        boolean hasIntVal();
        
        int getIntVal();
        
        boolean hasFloatVal();
        
        float getFloatVal();
        
        boolean hasBoolVal();
        
        boolean getBoolVal();
        
        AnimatorParameterValueInfo.ParaValCase getParaValCase();
    }
}
